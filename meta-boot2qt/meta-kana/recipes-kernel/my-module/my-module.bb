SUMMARY = "My kernel module"
#LICENSE = "CLOSED"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

inherit module

FILESEXTRAPATHS_prepend := "${THISDIR}:"
SRC_URI = " \
    file://${PN} \
    "

S = "${WORKDIR}/${PN}"
