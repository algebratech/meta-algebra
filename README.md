# Yocto Layer from Algebra :fire:

This layer consists of several **packagegroup** types, **recipes** and **distro**s.

### Dependencies
* This layer only depends on `openembedded-core`

### Compability
* This layer works on Yocto `dunfell`, `warrior` and `zeus` releases. It has been tested on zeus regularly
and works with other releases.

### How to install? :alien:
First, make sure that you set up your environment by sourcing required script.  

* After, use
```console
foo@bar:~$ bitbake-layers add-layer /path/to/meta-algebra
```

* Or by manually editing `bblayers.conf`
```
BBLAYERS = " \
  /path/to/poky/meta \
  /path/to/poky/meta-poky \
  /path/to/meta-algebra
"
```
