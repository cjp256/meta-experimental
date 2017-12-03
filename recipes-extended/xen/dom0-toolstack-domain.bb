DESCRIPTION = "A minimal control domain image meant to run as initramfs"
IMAGE_INSTALL += " \
    packagegroup-core-boot \
    packagegroup-core-ssh-openssh \
    xen-base \
    "

LICENSE = "MIT"

inherit core-image
