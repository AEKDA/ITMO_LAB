
mkdir lab0
cd lab0

touch machamp3 

mkdir shuppet6

touch shuppet6/baltoy 
mkdir shuppet6/scyther 
mkdir shuppet6/gloom

mkdir shuppet6/archeops
touch shuppet6/liepard

mkdir togetic8

touch togetic8/mantine   
mkdir togetic8/lickitung 
touch togetic8/kakuna    
mkdir togetic8/rhyperior

touch trapinch2
touch vulpix8

mkdir weepinbell4 
touch weepinbell4/cubchoo 
touch weepinbell4/krabby 
touch weepinbell4/aggron 

echo "Развитые способности Steadfast">machamp3
echo -e "Тип покемона GROUND\nPHYCHIC">shuppet6/baltoy
echo -e "Ходы Covet Dark Pulse Foul Play Gunk Shot Hyper\nVoice Iron Tail Knock Off Role Play Seed Bomb Sleep Talk Snatch Snore\nSpite Trick">liepard
echo "satk=8 sdef=14 spd=7">togetic8/mantine
echo -e "weigth=22.0\nheight=24.0 atk=3 def=5">togetic8/kakuna
echo -e "Типо покемона GROUND\nNONE">trapinch2
echo -e "Способности Ember Tail Whip Roar Quick Arrack Fire Spin\nConfuse Ray Imprison Faint Attack Flame Burst Will-0-Wisp Hex Payback\nFlamethrower Safeguard Extrasensory Fire Blast Grudge Captivate\nInferno">vulpix8
echo -e "Способности Freexong Point Cute Charm Snow\nCloak">weepinbell4/cubchoo
echo -e "weigth=14.3 height=16.0 atk=11 def=9">weepinbell4/krabby
echo -e "Способности\n Unbreakable Mountain Peak Sturdy Rock Head">weepinbell4/aggron


chmod 622 machamp3
chmod 577 shuppet6
chmod 444 shuppet6/baltoy
chmod 736 shuppet6/scyther
chmod 357 shuppet6/gloom
chmod 770 shuppet6/archeops
chmod 044 shuppet6/liepard
chmod 733 togetic8
chmod 604 togetic8/mantine
chmod 363 togetic8/lickitung
chmod 044 togetic8/kakuna
chmod 770 togetic8/rhyperior
chmod 640 trapinch2
chmod 046 vulpix8
chmod 571 weepinbell4
chmod 644 weepinbell4/cubchoo   
chmod 400 weepinbell4/krabby
chmod 006 weepinbell4/aggron


cp -R shuppet6 shuppet6/archeops
ln -s togetic8 ./Copy_37
ln -s trapinch2 weepinbell4/cubchootrapinch
cat togetic8/kakuna shuppet6/baltoy > trapinch2_48
ln machamp3 weepinbell4/aggronmachamp
cp machamp3 weepinbell4/krabbyvulpix



cat weepinbell4/** | wc -m 1>/tmp/data_file 2>/dev/null
ls -latR 2>/tmp/errorfile_4 | grep m | head -n 3


cat shuppet6/baltoy shuppet6/liepard togetic8/mantine togetic8/kakuna weepinbell4/cubchoo weepinbell4/krabby 2>/dev/null | sort | cat -n

ls -latR 2>/tmp/data_error | grep y$ 

ls -laR 2>/dev/null | sort | tail -n 2 | cat -n

rm machamp3
rm shuppet6/liepard
rm weepinbell4/cubchootrapin*
rm weepinbell4/aggronmacha*
rm -rf weepinbell4
rm -rf togetic8/rhyperior