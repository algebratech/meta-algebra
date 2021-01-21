SUMMARY = "Linux MQ library"
DESCRIPTION = "ZeroMQ is a message queue for different socket compabilities."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/zeromq/libzmq;protocol=https;tag=v${PV}"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = "-DENABLE_DRAFTS=ON"

FILES_${PN} += "${libdir}/* ${datadir}/*"
