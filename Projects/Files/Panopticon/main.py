# TODO: Run the program as super user
# TODO: Make an installation 'setup.py' for the program
# TODO: User choose the interface [DONE]
# TODO: Remove duplication [DONE]
# TODO: Alert/Notification
# TODO: System Tray Icon
# 	Program needs to be in multiple mode: {Unsecure, Secure, Ultimate Secure}, each mode represent by different icon
# TODO: Stop bad wifi using Scapy
# TODO: Kill Switch [DONE]
# TODO: VPN Connection
# TODO: Enable monitor mode [Optional I think only for Linux]
# TODO: Inherit. from network_profile and add some other features like taking BSSID for trusted and untrusted list
# TODO: Make the program running on the background
# TODO: Make the scan runs every X minutes
# TODO: Discover function will discover the attack if any of the following occurs:
#       - If the wifi disconnect , findCounter+=1
#       - If the computer connect to an open wifi, findCounter+=1
#       - If the computer connect to wifi with same SSID but different BSSID, findCounter+=1
#           If the findCounter > 2 then call alert function
######################################################################################################################
# Articles:  
#   -   https://github.com/awkman/pywifi/blob/master/DOC.md
#   -   https://programmerall.com/article/5941589508/
#   -   https://chowdera.com/2021/04/20210405093620137c.html
#    -   https://scapy.readthedocs.io/en/latest/
# Tools:
#   -   https://pypi.org/project/pywifi/
#   -   https://manytools.org/hacker-tools/ascii-banner/
#       Make the program runs
######################################################################################################################
import pywifi               # used for scanner
import time                 # used for timer
import sys                  # used for exit
import pystray              # used for system tray icon
from pywifi import const
from PIL import Image
from pystray import Icon as icon, Menu as menu, MenuItem as item

# Function for welcoming
def welcome():
    print('''

    ooooooooo.                                                  .    o8o                                  
    `888   `Y88.                                              .o8    `"'                                  
    888   .d88'  .oooo.   ooo. .oo.    .ooooo.  oo.ooooo.  .o888oo oooo   .ooooo.   .ooooo.  ooo. .oo.   
    888ooo88P'  `P  )88b  `888P"Y88b  d88' `88b  888' `88b   888   `888  d88' `"Y8 d88' `88b `888P"Y88b  
    888          .oP"888   888   888  888   888  888   888   888    888  888       888   888  888   888  
    888         d8(  888   888   888  888   888  888   888   888 .  888  888   .o8 888   888  888   888  
    o888o        `Y888""8o o888o o888o `Y8bod8P'  888bod8P'   "888" o888o `Y8bod8P' `Y8bod8P' o888o o888o 
                                                 88                                                     
                                                o888o				By Fowzy, Paxton

    Description :   Protection from twin evil attack.
    Support     :   🪟  Windows     &   🐧 Linux.

    ''')

# Function scan wifi
def scan():
    wifi = pywifi.PyWiFi() # make an object for the pywifi to start scanning
    interface = wifi.interfaces()[0] # use index 0 to obtain the Wi-Fi interface, according to the documentation
    # interfaces = wifi.interfaces()[interfaceOption]
    # Calling a function that will start the scan
    interface.scan()
    # According to the documentation it is safer to call scan_results() 2 ~ 8 seconds later after calling scan().
    time.sleep(2)
    # Get the results of the previous scan. 
    result = interface.scan_results()
    # Print APs
    print('''
    
    .d88b.                       db    888b.      
    YPwww. .d8b .d88 8d8b.      dPYb   8  .8 d88b 
        d8 8    8  8 8P Y8     dPwwYb  8wwP' `Yb. 
    `Y88P' `Y8P `Y88 8   8    dP    Yb 8     Y88P 
    
    ''')
    print('-'*160)
    print(f'BSSID					SSID				        FREQ		        AUTH			AKM			SIGNAL')
    print('-'*160)
    for i in result:
    	# we need ssid and bssid
    	print(f'{i.bssid}			{i.ssid}			{i.freq}			{i.auth}			{i.akm}			{i.signal}')
    return result

# Function will remove all the trusted APs
def removeAPs():
    wifi = pywifi.PyWiFi() # make an object for the pywifi to start scanning
    interface = wifi.interfaces()[0] # use index 0 to obtain the Wi-Fi interface, according to the documentation
    interface.remove_all_network_profiles()
    return 'All profile has been removed.'

# Function will keep the profile of the trusted profile
def trustedAPs():
    wifi = pywifi.PyWiFi() # make an object for the pywifi to start scanning
    interface = wifi.interfaces()[0] # use index 0 to obtain the Wi-Fi interface, according to the documentation
    profiles = interface.network_profiles()
    print('''

      88888 888b. 8    8 .d88b. 88888 8888 888b.    8    888 .d88b. 88888 
        8   8  .8 8    8 YPwww.   8   8www 8   8    8     8  YPwww.   8   
        8   8wwK' 8b..d8     d8   8   8    8   8    8     8      d8   8   
        8   8  Yb `Y88P' `Y88P'   8   8888 888P'    8888 888 `Y88P'   8   

      ''')
    print('-'*50)
    print(f'BSSID					SSID')
    print('-'*50)
    for i in profiles:
        print(f'{i.bssid}					{i.ssid}')

# Function will keep the profile of the bad network
def untrustedAPs():
	print('''

    8    8 8b  8 88888 888b. 8    8 .d88b. 88888 8888 888b.    8    888 .d88b. 88888 
    8    8 8Ybm8   8   8  .8 8    8 YPwww.   8   8www 8   8    8     8  YPwww.   8   
    8b..d8 8  "8   8   8wwK' 8b..d8     d8   8   8    8   8    8     8      d8   8   
    `Y88P' 8   8   8   8  Yb `Y88P' `Y88P'   8   8888 888P'    8888 888 `Y88P'   8   
                                                                                 
    ''')

# Function will check if my wifi got disconnected if yes then alert and enable the killswitch
def stayConnected():
    wifi = pywifi.PyWiFi() # make an object for the pywifi to start scanning
    interface = wifi.interfaces()[0] # use index 0 to obtain the Wi-Fi interface, according to the documentation
    if interface.status() == const.IFACE_CONNECTED:
        return True
    elif interface.satus() == const.IFACE_DISCONNECTED:
        return False

# Function is kill switch will basically disconnect you from your connection entirly  if it found you risky situiation
def killSwitch():
    wifi = pywifi.PyWiFi() # make an object for the pywifi to start scanning
    interface = wifi.interfaces()[0] # use index 0 to obtain the Wi-Fi interface, according to the documentation
    interface.disconnect()

def enableMode():    
    while True:
        wifi = pywifi.PyWiFi() # make an object for the pywifi to start scanning
        interface = wifi.interfaces()[0] # use index 0 to obtain the Wi-Fi interface, according to the documentation
        # run the scan every 300 seconds (5 minute)
        scan(interface)
        time.sleep(300)

# Exit function
def exit():
    sys.exit()

# According to the documentation we have to make the icon visiable in order for our icons to works in all platforms 
def setup(icon):
    icon.visible = True

# Function to run system tray icon
def systemTrayIcon():
    # Running icon
    image = Image.open("disconnect.png")
    menu = (
        item('Enable security', enableMode),
        item('Kill Switch', killSwitch),
        item('Trusted list', exit),
        item('Untrusted list', exit),
        item('Quit',exit)
        )
    icon = pystray.Icon("name", image, "title", lambda: menu)
    icon.run()

# Main Function
def main():
    systemTrayIcon()


# calling the main function
if __name__ == '__main__':                                                      
        main()