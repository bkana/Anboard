SUMMARY = "Qt My app"

DEPENDS = "qtbase qtdeclarative"

LICENSE = "CLOSED"

require recipes-qt/qt5/qt5.inc

FILESEXTRAPATHS_prepend := "${THISDIR}:"
SRC_URI = " \
    file://${PN} \
    "

S = "${WORKDIR}/${PN}"

QMAKE_PROFILES = "${S}/${PN}.pro"

do_install () {
  # Application
  install -d ${D}${bindir} # create '/bin' in package folder, NOT in rootfs 
  install -m 0755 ${PN} ${D}${bindir} # install our app into packagedir

  # boot2qt default start up link
  # Note:
  # This is just for development. If this link isn't set,
  # boot2qt starts a complete demo with everything that is
  # part of the default image.
  # Later all this stuff should be removed in a customized
  # copy of the image recipe.
  # The clean way to start something on boot with this and other
  # modern Linux distros using systemd should be a systemd startup
  # file.
  ln -sf ${bindir}/${PN} ${D}${bindir}/b2qt
}

# add to rootfs
FILES_${PN}-tools = " \
  ${bindir}/${PN} \
"
