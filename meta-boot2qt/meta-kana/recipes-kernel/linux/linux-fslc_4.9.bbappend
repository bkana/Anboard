FILESEXTRAPATHS_append := "${THISDIR}/${PN}:"
SRC_URI += " \
        file://defconfig \
        file://add-anboard-support.patch \
        "

COMPATIBLE_MACHINE = "(mxs|mx3|mx5|mx6|vf|use-mainline-bsp)"
