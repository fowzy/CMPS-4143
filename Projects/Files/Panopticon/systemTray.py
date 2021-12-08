import pystray
import pywifi
from PIL import Image
from pystray import Icon as icon, Menu as menu, MenuItem as item

wifi = pywifi.PyWiFi() # make an object for the pywifi to start scanning
if wifi: # if wifi object is true(or exist):
    # do this thing
    image = Image.open("connected.png")
else:
    image = Image.open("disconnect.png")

def print():
    pass

menu = (
    item('Enable security', print),
    item('Trusted list', print),
    item('Untrusted list', print),
    item('Quit',print)
    )

icon = pystray.Icon("name", image, "title", menu)
icon.run()



