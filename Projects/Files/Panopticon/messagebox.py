from tkinter import *
from tkinter import simpledialog

ws = Tk()
ws.title("Trusted List")

answer1 = simpledialog.askstring("SSID", "Please enter the SSID (wifi name):",
                                parent=ws)
if answer1 is not None:
    print("SSID :", answer1)
else:
    ws.destroy()

answer1 = simpledialog.askstring("BSSID", "Please enter the BSSID (Mac Address):",
                                 parent=ws,)
if answer1 is not None:
    print("BSSID: ", answer1)
else:
    ws.destroy()

ws.mainloop()