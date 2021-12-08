#!/usr/bin/python

import subprocess
import shlex
import getpass

print("This script was called by: " + getpass.getuser())

print("Now do something as 'root'...")
subprocess.call(shlex.split('sudo id -nu'))

print("Now switch back to the calling user: " + getpass.getuser())