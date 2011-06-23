#! /usr/bin/env python
# encoding: utf-8

VERSION = '0.0.1'
APPNAME = 'KEmulator'

top = '.'
out = 'build'

from waflib.TaskGen import feature, extension
from waflib import TaskGen, Task, Utils, Options, Build, Errors, Node
import os
import re
import shutil


def configure(conf):
    conf.check_tool('java')
    #conf.env.CLASSPATH_KINDLET = ['../../lib/kindlet-1.1.jar', '../../lib/KindletImplementation-1.1.jar', '../../lib/log4j-1.2.15.jar']
    #conf.find_program('jarsigner', var='JARSIGNER')
    #conf.check_java_class('java.io.FileOutputStream')
    #conf.check_java_class('FakeClass')

def build(bld):

    # in the following, the feature 'seq' is used to force a sequential order on the tasks created
    # java
    #

    res = r'src/resources/kindle3-landscape.png'
    tgt = bld.bldnode.find_node(res)
    if not tgt:
        tgt = bld.bldnode.make_node(res)
    #print "tgt = ", tgt.abspath()
    bld(rule=lambda task: shutil.copy(task.inputs[0].abspath(), task.outputs[0].abspath()), 
        source=bld.srcnode.find_node(res), 
        target=tgt)
    bld.add_group()
    # srcdir: directory containing the sources to compile
    # compat: java compatibility version number (compiling with a too recent jdk may cause problems)
    bld(features='javac jar', 
            srcdir='src', 
            outdir='src',
            compat='1.4', 
            sourcepath=['src/java'], 
            #use='KINDLET',
            classpath  = ['../src/java'],
            destfile='KEumlator.jar',
            basedir='src',
            jarcreate='cfm',
            jaropts=['../manifest.mf'])
    # jar
    #
    # basedir: directory containing the .class files to package
    # destfile: the destination file
        #bld(features='jar seq',  destfile='playtxt.azw2', jarcreate='cfm', jaropts=['../manifest'])

    #jaropts = '-C default/src/ .', # can be used to give files
    #classpath = '..:.', # can be used to set a custom classpath
    #)
