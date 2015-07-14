#!/usr/bin/env python

import sys

print "package clef_tools.stopwords;\n"

print ("public final class %s {\n" % sys.argv[1])
print ("    private %s() {};\n" % sys.argv[1])
print  "    static final String [] list = {"

first=True

for line in sys.stdin:
    if first:
        first=False
    else:
        print ","
    s=('        "%s"' % line.strip())
    print s,

print  "    };\n"
print "     public static String [] get() { return list; }"
print "};"
