require recipes-bsp/u-boot/u-boot.inc

SRC_URI = "git://github.com/fr0st61te/u-boot;branch=master;" 
SRCREV = "d675f0a16ecc876b1aa78b4151af89c80fe0f4b9"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"
S = "${WORKDIR}/git"

PROVIDES += "u-boot"
