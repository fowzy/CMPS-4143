import sys
from PIL import Image, ImageDraw

from pystray import Icon, Menu as menu, MenuItem as item


clicks = []

def on_activate(icon):
    clicks.append(icon)

    if len(clicks) == 5:
        icon.stop()
    else:
        icon.icon = images[len(clicks) % len(images)]

image1 = Image.open("disconnect.png")
image2 = Image.open("connected.png")
images = (image1, image2)
print(len(clicks))
print()
icon = Icon(
    'test',
    icon=images[0],
    menu=menu(item('Toggle ', on_activate)))

icon.run()