public class EncryptorTester2 {
    public static void main(String[] args) {
        Encryptor encryptor1 = new Encryptor(3, 4);
        System.out.println(encryptor1.encryptMessage("What are you doing next weekend?"));

        Encryptor encryptor2 = new Encryptor(6, 5);
        System.out.println(encryptor2.encryptMessage("This one time I was trying to do a handstand and fell backwards and landed on my shoe. It hurt! I won't try that again."));

        Encryptor encryptor3 = new Encryptor(3, 2);
        System.out.println(encryptor3.decryptMessage("Ti hsiscn ofietdnia!Bl e nto helo okotAu!A"));

        Encryptor encryptor4 = new Encryptor(5, 5);
        System.out.println(encryptor4.decryptMessage("Tite hsocmi presa es  stsaneregtd see J  nfaBidomonee  d ftm.cuhe alisBr,ssaieecgllstelft!  -rAwsduA"));

        Encryptor encryptor5 = new Encryptor(6, 5);
        System.out.println(encryptor5.decryptMessage("Meottai ooufdsl rtdcsrnelh e r etWwht hhiihmselgro.nlhen    sld tmc egoehsne  otttcbous oacHusAAkoloAA?ploAA eynAA f !AA"));

        Encryptor encryptor6 = new Encryptor(9, 8);
        System.out.println(encryptor6.decryptMessage("Io ihscnongeoesofn rnn  do.cac poir rprirfnmTyhyso gahpyp ce tit,tteniis  siea o,pc gpttr rotirihmkonhneoeancveasn toee le iiwsro nononstrrtffn atttencxlseoe oitl x rfwp.yptanonh ,l,nar eI a  tmardoiiai stennnlvk ealyit real  zid rcaaaeeeatkinudsc e ndt  icxtt hpcpitoeaoaahp  xcrrnehbptceo tc t  sriird pisinoyoirn gfnpetettio.tssvehnr i eereamEonlnf lannoftert eetoite tl  unondhlctltrceeioode.en gn -r  iiitabcFbenbe eeoustlnw pr annn  patlsc uusne ,rsssedcr ycueuoheaphasdmnantel o is imla-ecoeoey rnc eyoIsotrkr rts  yeaai idtpytntibeht e hslceigdam er oe l.p ymnnbg otpests  r-dtshstb d iaoehuaeeoguset snnets ,wic   ik egrswpneflnyciogyolephesearsi dmi te lr.edcisale ,eooonsqA rmnud uncapar ai obulcsrranlt ekeeut naceehrhrtsr  eooe iymw vrcclpeikiiiaytstedzpn  shyeei dta  ddeeehgtp brribthuAyi puoosA gtit reAtioe uirAhn nnnzsAeartoae.A testudAAooc  t AA"));

        Encryptor encryptor7 = new Encryptor(11, 4);
        System.out.println(encryptor7.encryptMessage("What did fifty cent do when he was hungry? fifty-eight"));

        Encryptor encryptor8 = new Encryptor(6, 9);
        String tho = "A n iectooo cowfnio n ,sra a  dllvtnilaihon wae gkstrwa le sybd I  e ttatebosrh e  eas fw thalit obynoaul.go  fefusga  nmetbtdat oh.l lde liiy T tt ghtstoreo lfo boiyeneue. ’ers bt,s Be  eaeeco,ncsaf ya r fwudeclaso wniiQIhssb.Na  l Tttie7R hm.5Ohip”  uno -TmksS Oa sE“ BT D kA.HAOeR OYNrRBU :sYESA  ”NENSo S GnnIO-Le NN Eath.PoBSe A AO CNrRNgaSeR’rm vYSoeUe  urPaBBna lEEd t NDREr  dO yftiOO’lhfMNsirf : poeA hpurNBaigeGannhnLrdg t  lRwysioR ewnsYble e llahtYaoti.ecwes lk r Bl,bscAo lao ll,cwyao k ecwy,blk e ll,blyao llecwyaolk ecwl,blk boklGalh oLrahawErc,n. yk d.O .b .Nw.ly :e.aeA aoclNBriw lnrnepo ogaiotr tckh.tekie hren Be dgmA h, iRse irRY)ee H  t le(Y’ii CesttpOa  tiNhsulcT,hpek’ a .sDlka  t oee haw ssen t i dohtnb neoklyen ,ae. t cl ghtklHoeakoC ,sepOO  s NFas oT notfAHdmhfIO ee NNp  aEEuht RYtonh tnteiHs hyse h    siaihsosnnaqm dtiuem ori og .riuareed agns bnl  oodehtft sehftr. e lo t telTalh,lhkie s loAAAsirAAAokaAAAmenAAAe tAAA d.AAAoeAAAAnoAAAA dAAAA";
        System.out.println(encryptor8.encryptMessage("According to all known laws of aviation, there is no way that a bee should be able to fly. Its wings are too small to get its fat little body off the ground. The bee, of course, flies anyway. Because bees don’t care what humans think is impossible.” SEQ. 75 - “INTRO TO BARRY” INT. BENSON HOUSE - DAY ANGLE ON: Sneakers on the ground. Camera PANS UP to reveal BARRY BENSON’S BEDROOM ANGLE ON: Barry’s hand flipping through different sweaters in his closet. BARRY Yellow black, yellow black, yellow black, yellow black, yellow black, yellow black...oohh, black and yellow... ANGLE ON: Barry wearing the sweater he picked, looking in the mirror. BARRY (CONT’D) Yeah, let’s shake it up a little. He picks the black and yellow one. He then goes to the sink, takes the top off a CONTAINER OF HONEY, and puts some honey into his hair. He squirts some in his mouth and gargles. Then he takes the lid off the bottle, and rolls some on like deodorant."));
        System.out.println(tho.length());

        Encryptor encryptor10 = new Encryptor(6, 9);
        String tho1 = "Ititwut t en’d’p gsrsosr i wtyavaea,bebry o,o, wu u he u th dtw ote oiuavirnrkonk seu ,t  rt haw hpenhPeu datAAAAA’AAAAAsAAAAA AAAAAoAAAAAuAAAAArAAAAAsAAAAAAAAAAA";
        System.out.println(tho1.length());
        System.out.println(encryptor10.decryptMessage("Ititwut t en’d’p gsrsosr i wtyavaea,bebry o,o, wu u he u th dtw ote oiuavirnrkonk seu ,t  rt haw hpenhPeu datAAAAA’AAAAAsAAAAA AAAAAoAAAAAuAAAAArAAAAAsAAAAAAAAAAA"));

    }
}