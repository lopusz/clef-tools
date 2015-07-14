#!/bin/bash

START_DIR=$(dirname $0)/

LANG=English
curl http://members.unine.ch/jacques.savoy/clef/englishST.txt \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=French
curl http://members.unine.ch/jacques.savoy/clef/frenchST.txt \
 | iconv -f ISO-8859-1 -t UTF-8 \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=German
curl http://members.unine.ch/jacques.savoy/clef/germanST.txt \
 | iconv -f ISO-8859-1 -t UTF-8 \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=Italian
curl http://members.unine.ch/jacques.savoy/clef/italianST.txt \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=SpanishShort
curl http://members.unine.ch/jacques.savoy/clef/spanishST.txt \
 | iconv -f ISO-8859-1 -t UTF-8 \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=SpanishLong
curl http://members.unine.ch/jacques.savoy/clef/spanishSmart.txt \
 | iconv -f ISO-8859-1 -t UTF-8 \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=PortugueseShort
curl http://members.unine.ch/jacques.savoy/clef/portugueseST.txt \
 | iconv -f ISO-8859-1 -t UTF-8 \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=PortugueseLong
curl http://members.unine.ch/jacques.savoy/clef/portugueseST2.txt \
 | iconv -f ISO-8859-1 -t UTF-8 \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=FinnishShort
curl http://members.unine.ch/jacques.savoy/clef/finnishST.txt \
 | iconv -f ISO-8859-1 -t UTF-8 \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=FinishLong
curl http://members.unine.ch/jacques.savoy/clef/finnishSTOLD.txt \
 | iconv -f ISO-8859-1 -t UTF-8 \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=Swedish
curl http://members.unine.ch/jacques.savoy/clef/swedishST.txt \
 | iconv -f ISO-8859-1 -t UTF-8 \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=Russian
curl http://members.unine.ch/jacques.savoy/clef/russianST.txt \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=Hungarian
curl http://members.unine.ch/jacques.savoy/clef/hungarianST.txt \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=Bulgarian
curl http://members.unine.ch/jacques.savoy/clef/bulgarianST.txt \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=Roumanian
curl http://members.unine.ch/jacques.savoy/clef/roumanianST.txt \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=Czech
curl http://members.unine.ch/jacques.savoy/clef/czechST.txt \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=PolishShort
curl http://members.unine.ch/jacques.savoy/clef/polishST.txt \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java

LANG=PolishLong
curl http://members.unine.ch/jacques.savoy/clef/polishST_2.txt \
 | sed -e '1s/^\xef\xbb\xbf//' \
 | tr , "\n"  \
 | sed "s/^ *//" \
 | ${START_DIR}./stopwordsTextToJava.py ${LANG} \
 > ${LANG}.java
