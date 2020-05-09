# Package summary
SUMMARY = "Hello-world-mod"
# License, for example MIT
# License checksum file is always required
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

inherit module

# hello-world-mod.c from local file
SRC_URI = "file://hello-world-mod.c \
 	   file://Makefile \      	 
	   "

# Change source directory to workdirectory where hello-world-mod.c is
S = "${WORKDIR}"




