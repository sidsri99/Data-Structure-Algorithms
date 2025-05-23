/*

P5: Total Characters in String After Transformations II

Example 1:
Input: s = "abcyy", t = 2, nums = [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2]
Output: 7
Explanation:
First Transformation (t = 1):
'a' becomes 'b' as nums[0] == 1
'b' becomes 'c' as nums[1] == 1
'c' becomes 'd' as nums[2] == 1
'y' becomes 'z' as nums[24] == 1
'y' becomes 'z' as nums[24] == 1
String after the first transformation: "bcdzz"
Second Transformation (t = 2):
'b' becomes 'c' as nums[1] == 1
'c' becomes 'd' as nums[2] == 1
'd' becomes 'e' as nums[3] == 1
'z' becomes 'ab' as nums[25] == 2
'z' becomes 'ab' as nums[25] == 2
String after the second transformation: "cdeabab"
Final Length of the string: The string is "cdeabab", which has 7 characters.

Example 2:
Input: s = "azbk", t = 1, nums = [2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
Output: 8
Explanation:
First Transformation (t = 1):
'a' becomes 'bc' as nums[0] == 2
'z' becomes 'ab' as nums[25] == 2
'b' becomes 'cd' as nums[1] == 2
'k' becomes 'lm' as nums[10] == 2
String after the first transformation: "bcabcdlm"
Final Length of the string: The string is "bcabcdlm", which has 8 characters.

*/


class Problem5 {
    public int lengthAfterTransformations(String s, int t, List<Integer> nums) {
        
        /* TLE
        int count[]=new int[26];
        for(char ch : s.toCharArray()){
            count[ch-97] += 1;
        }
        for(int i = 0; i<t; i++){
            int nextCount[] = new int[26];
            for(int j = 0; j<26; j++){
                if(count[j] > 0){
                    for(int k = 1; k<=nums.get(j); k++){
                        int next = (j+k)%26;
                        nextCount[next] = (nextCount[next]+count[j])  % 1000000007; 
                    }
                }
            }
            count = nextCount; 
        }
        int total = 0;
        for(int i:count){
            total = (total + i) % 1000000007 ;
        }
        return total;
        */
    }
}

/*

s =
"u"
t =
5
nums =
[1,1,2,2,3,1,2,2,1,2,3,1,2,2,2,2,3,3,3,2,3,2,3,2,2,3]


s =
"bvqbowlhpfhpaddcegzxiawnprkhbvqlmqegsydbykdrxywxvtjlqkuvzasrfdwgepgkbcsxebrkeegttxugleyzytnfpsjimuxqjpjgqbxtbrpntxgxaahldwwnemzwtpgnbvhqikibmqwkxjlvklnuidgwhrxdnwjzxgazfckirtzzwacsvinisjzjyaibwamcbjkcxkdzripdrgyeewkpgofezpcbjbpbdhzltzmqffaqrqcefjwyuyimzpftumzdkazbkijezidrcabvfiltkxzzyywxogsccxkmihqwmehuicpolzxxqvyjdtsuohwthzmigprfjooframjuckvqxjboowpmbdwokzprniwejbbbzwvspufgilhylgukfqgdkiuezvfhxsbpkorbouyqapbwlbezukjhbiiykncopskkzajggslrplccqqcnogvhzjprfyuanmuuwhbndkmasesrpgwdgjyvcscmtiwyhsexvahitchwswafbftffrfpnwepijdmxlzihsnszpjvztxjvxbcbepbfhzcvmxfdibhycvzmzsnqtowvnyqoprmlpfdemyxawlahnlyihrkauraudjvkbsovqhpfvuxletqienvlcwnwdntusvwrgmlaibacdmxwarakxiqiqaaihtnfdmkrtknqrhhsebeizjwrdavzldafamwkjvtavitzoyzwavorvcbclapuzeeigndagdbpbxnexumoshtbkzlhsqetyzqfhswuxnxtrmzjaxlzjsdmdhgpjtdoogehkcanyylfsgpceosbeokdzarlogagljrzadttgwaksswbakodwjtpysrhthgmlpjixcxrfgaqcnqlchanwivxngtorsrplqmrxmaqwairjmbepggtuajfmqtbrcgczlogwkrjzhiqdbqbrcrlpovgspnmuxdqewqlbhzchfxrcxblhoozxmasnmzelzzfclsklpxexzmnenoigazshmhwkfrlkbkyerupbgedosfmvdburuqfydstnjyjpmusnfokoyjvdgnphvotckwvageasfrsknnxnbvmqqlvtyvbgijndosppsfrbzmkkgzzufzecmyqnacfyuylrewbuybecszxxovsflslzbbpapzywgahkqohvlzdgeveoqjvawwehecdlgtnseubafazduxgwbxqzponpizvsjosjddwajtpvenwbsgtqtessiacspjiehlqvjhugextkjlhgfkqiseqjhfvkewugmmwksrlxrvnrmstlklaytbqwfvzaebkbwjsqfgvwdoorepxcxbelvaobjgtdjlvqyninoehfroviegdyiilrpewvgpdipfqlizzxzzfvhqizrdcgmpbjffljpzyljupwenvybbvcgwvgqnfcfdfjlckioxkwnqiurpodtduitawsinvtbfnhbmozwukjqapeewivqmtjuqtlwygzfujfovvabmwsmmousfvcmoedejhurbxrzbdrreqymtuqzyjojjncibhelurkwajdfvdmeiabxfaqqpiqishborzzkztsfskfbbqwwathksdbrvzfbncxkmretflmddtoyxthwibtfeeowiippwoccnmpcswoqstmjdesxkhriqhftdojbsghfudrutzgduxdnrrheksjdyzrdtbkdbcrjkfhlfkvuadhiqbpnqljrqprdwmthcgstakkrmhivuirdvmwqkswjgnmqcqziwqbqxhrhhbtgagbdibjilhzuhglolxwpfywltxqfvbbvkmgpasvxaforlbgkttrnmhszehynywnwbxkshrajhymvgexcsqcfmnhiyikmzkwxtwaebajwoxeqmehyqrxyairhlsbazvkdbqhebtovualatufvauqeczcrrkyletfobzjvcauvnunnzogkdznfwstrkoicafynnbbdlutkeauqwyhqrdkgtrdbngeljgdfrvfiiampsuawxpsoosedtnnjwtdkwoykbukipvsvyefwkmlkrezsglrjnvafyyvbirnjkqgcobuhnwumbjwuyuoluyjmihghzlbrkkjewnobcuwopkdvokmqqwkpesgkgqowcxglywloojdjfhzeoihselaabpghovbwgaxwpdonuthapdunjpqldjkzovybxpzomvviutgljkpbdimbmanzyyzghlnwohqpjxupzrrhcrqzqhiupkinhjoniwoyxlgadvdlqnfwjucdcvvzmezbsqtcotbrmmjtlaihilpccrpszratqghwktpzciqexyqrbxnzfjbevsucqhmaaaedekipvhlbpscrwjwkzyodhssywlikjfmdbceehcvrhkdjxtvgtqmomaraninjzhvwzdteirgubbpochqocexfqxnqmqngezpedgpsiltsramrukxshrfhnuvsxafjfgkmqyapytiaeujczucwceyecjjbgbdmoavohqovlsunwbglroncvekqqbkuijehjbnyteoaegycbygfkfekkqnqcrktbbaksrcgyqmqnrttmhpefhzlmvoajypyrdchmyibgfbjgumrdfchliqdjjmoztvchtdzckjyzwyvfvabscxgymxosfstoagmvpvdofemlfzfkvexwrphbfxfsgumjvkisvvrpjztcxuhzqjwoatzqyiwjsvoismgadkxnejpbzhdymjbgejoboelmdpspqisukmzdytpqzbzpdhtyruutllgsipecruztupxjxnpgbcgtbhhkwcpcscjeebjzaxambflggzdhaupwjsswizkabaapecazfohbesowsyttexkqlayvnghvpcrhglqioufwxdhyqiyeedfioepddqmqzgvbvnkdbkkjujwrlfuxjfbuhicxnanjghbtnfdfxrcxdrqadmbpascwccifcpubjarrnzwtpglzowwekotstiwxlzyiesiqtbhoelbugxricrngzpxdarztndqnwtztoexcfsfffybkztsiwzarvzxesxrioahfheolpqneizdobicukwymgajilvdbxjbzzzqrjcoihgjlofofkxsbfmztousxolyfynxttrfhurvacvuqmvdmvdpvjefvwnmvcjqfleifbgntlwhynrqprngfcahzayyxrpunwtqmzczmigqpmmfyvvqciskpjxmimbdtttzfimioenelferxtcudmalkbqojuyrptrcrcgokjzromzeeyuznjprormpqtkjrzuwncumgrtpruqpvuiaseftkzhqdcywcovjytkvxkutknlymoiwknogudokqmwvmkqcxbyafpnmderopxihtuvtacnmkshhskozpysvfinvkseyhhdycmvcqmxaqbhbvzsdzlguqquqcabykcsqaeefmvgfmevsnukwrytcdxnmvpbfqekcjmccqfqswmotyxeezypgarndmalaagviyyenfruxcnwqtgyxifstfgbsdmlwtxmkoahobzemdrbwccufimsktsaluysyigwaveuezhfuqniciriejhwrgdzuvtducvkydelsfthgxizobpfciquywfqhhpsthfipenbotvizyqrvtfhkzvepscmfauhctmkhhyjjrmusjdwfuynghbwaorifkffnetqehbkapoqojkkubfxoisdouzqxejadzulqfquzmlaretcrrcjscjklfufuizrtvosthcecivbogxllpxzoihiirvderqkxhekqxaelgvippqonvwsifzoytfennzidgwmrppdlwwfcvuszmsmmqsftuhnauohniuftzbabhwdekllsszmloqjosdmptpuusnnzkrrxdyccjoxyoavkgdwbwkliaotzjlesbiahathesagnlrfezqorgyukasxnlnqlmcfokqztpcczlsvytwmrphmceyqtnvntwmmljfisyiszhacfyhrikvbkejblryhfgdwumwzstpzcgptphqmqqnfttuqjshcmmzfkopbqalbxjrscbefblkuhbzmnodgajzoqnkhzwsfhpvgokcyaqqybcwbqyrpdzqdtfiayvophivvfwgkigcqttxpigpqxvyvtfkmdgsdijxihcyiykdhxiyepcoxkpjirsdeezsjlogbguvshcasuvvpyrybcuvqbqtaddveyndsnrjdffszzhvknbsrcaeouyfqggpxzutgoxmkanvzkztnelncpxsjcimfoefqivpqrfvkgitwwwqtqisozoxuxheaumhntikfzlgvojnecympqdnbeghyktnzbbpcpfdqfnyihjchqtmgouwoevkylhzyxmmkoiywopdwfueznukqgxdxvgvqlxmptdszochifankbozlktpmstvllvkqytxywteiidxtvpdwurzuosonvmxjqgjteqmclsjxklopeiysjqjlkvabdqtmuvlalchllobcjxcxeicnvmgttkhxabkfxppktmptczytukbzmwymwmchawbohkqtajgiwbmlhvivmhdeeonngvcbgcsppbxeiooilgelxxuudkjxzzugcletjdtznqpzdalpzfhqzyrntljbnsbfpeeqvgpsrykunsmjjasnxmvmavuemnnvxcobjzvfvygzbdzyzrgxpqvarkwtlsbuiksjgsbhcneytfylsrokpcgjahljzfwusmlwydfhvqbjwdckzowqdhtgmtswsemghxhwlycaheudikfjfmpnuvfxrhfjjyeregrejcfcibtjjxnsyeohuhurrxyakklddbbruzxmjmbyhyrzqcjdazkvjdhebkfchywyqevqgpkwrfiwtssqvbzyovhaagqeekjcbzznziyymrlpbzclvttzwcpesswxvwknzpqdnzcfwwdanrvsgpfxakgchrkkguerurekcumuhlhoxhcddsvmxpnmkfddjcepsjnlxgqaqtmllpindndwwavcthnujkzfdkctnomipuctconyajkfvpwjjcwprzrzpjetmjwgumaxlriijkuanmqpuqlfofjdqxizbpdmphnavmsibtwsgpgtzqlxcldejedwigopiahgttqffdgyigxmmoinxjwsuljhtsjaifvcapgoxazoondpyvrdfodfqkuckyibcxykcxrzoxdxkwgjuafyshxaaofjxnftgjlswgtkbzyxxgawhrgliabdncnsfvmcuszkgtiogafcvtpssiqctlmaccvkqroobmnmirmtwhgcwxxuxghorsjauqkxjewjdbfamcgkakjlsryvawhsniuksmicjscbgcliccjrinjwtnghnecdpgjbkscuzrcvvdgigdrqmqocgwfxmosbpjwbjjafdnovgxhetphpydyogxuqyxxxqmyentbagcgfkufrbzqmzdljfhqxfdlrhvnavpouoeltrggaqvxaegboljjcladscdiddqihbzukbfcjgqahxlzvweqkokbpffhalieatflejpxstoseqossdrsbflrjolsksrboyewyxkvyodykugxinhgpcmqnzhlymvjmiybncvsvpvzldlytvhtqzocqugzvlrsuxnrkscscfvkpplovcikigyopogwojvwnxhguzxzrqjyduwpsojsimhogzhfmstjjyvsdnycpkjgynelbyszwddycgypflqkkobkyvxeccfcgixhoifxuehagwdkzztanhdivlsntppgcdajyyuhrtipsduanwkagmhcteousrweavrwqnncmxgdghjpcwjtaokhudyzxrxhnqwslgpoemjopsbjmuvtmfbyniuxskwuzdadvwueiohacxmfuddkkttddrqiiwsujeaeodbzguuddyzwnpycfknuojjdwayqyttpbsuqlyvbrgidmpzjnqbkagofrijikrittaxtiqqbwvtrnqutmzjfnqkashbdtisnfffihniknqeblchemzwsfhjoiotjmuolyprdfpidfpeutllwtavcdoreitatpdjififpfobnrhkowzjnbdoselynbewxagtzbetyriooufnpgjnzirjutvestaxbudtfwtlmhokedkuntejcyyzmhyeveyixyahwwmohmtuwvosqiiwokkyyiqdfiuqrylczllgbrmjpydskjblztygxgpeqfiikbsvrrmfmjjyjnmmcshmkhywnztmymcrsgpqmcvlypuydtrnyjxrlnjzkcwlzzvougctjsnzrdhqakyftwbybljakdsfmsexaxaxksvbqqvaegfestqfdsoaofaggyfhvkvhlvcbgtwdmnuwthivinencppqwxaojabpydxlcfblgysglnjoqkzywfwetjjshordjpfxawoupqpjtirmzylmpleuonnveqdtwzekqakrobsxbxqwildpuvkmlogtzzhwvuoztkspxekuvrqwzbzdzhjozqosnvmrucnspeorbrwlgbrqljqgmkuedgcjptzykyzmovpungwinhmrysehreebjtkafbglmrauhympjkarcyyldmzhkvjnkrtzdhhvtqoywsrbfiwswwzapmkbyewkbcujbyyxifbzigxsfoteelpywbjdfzvcnuwybbgndnbuenozmlpawibxklhgmcoodwipjettuhutambkyevapbhhumjhqfakarskfmjjpigrjsxlqhixovzdefqxymgnwcovfifjvubjaxoxtqmaidhtaqcsqggwxwjcsqqhlqysswpezaoarjssligvnccvbuejjbkwzxaikkcsrqmrdvmskgopzqlpxdouzuhsokcbweuwrzqcuqjxewhpmkrafivzurajyzlgsstlssdhfnjmjotyjqbnsjnfcvsptejrzicswkzvmhwumtprzhdxzqxjlnkgmociveqqrngydipsghrmntqymmqmwxrlovgxtepxfxlojwpmlzmenslyljtptkndyrjuikjrrurazgwgjginlfyuwmkogriokpxhbablkdwwnxxpjokfnlimmbeausuukteotoypwakqzeborvfwiolyvvxniukzwfzvubuvayzkhldwmbzpwjzmooryyxotosaaaecoivyqvqzqrylfdugcubmasktfpxpsvkqrqntipxlqpbjgpjootfvxbycvdolnrmcgvdkyjlyqjgozirijcwafdajnrokkubafhujulkfmqsewbllzqhkutsardfvkhswcpflausmcgjlhgskdsoppylvgulxvuquaehvssuoxfgqvidlmmocmbuhmzpmetmoewsokxpcnybnrmkpjxgebuydnftzxunbdmpqvttmpfziolhaoezdwhcrgsusxmgqgstwyojzwqtfnqvyjeihzpzjhzvhpffdnxejipduvvhwabolklhkgqoyqfupepibhjtnylnoivjfguohjlvtrxnjuqhhynebewhsmahwpqlpftmnvmjuaubcnunggqmwszhrhehpesvviafoxlmnvhdjcokoizxdtehtlxpucjyncistahijvmletwghdehijbxgqucdznemeexaxgkokqtpbhhlqxntxsflixprpwhkaubfiejpvcnavbopiezsfsdbaoeofrqzlneffagotrzvlkfwzlvncjglfcjxdxajggcqvceaobzdsmrcsrxjkxablpnmwodbvdwahnvsoxbiyayzerffyprleaurqqnuldoojygdufoqxgpnvdnwmbwllukunjtqxwyhsrqwwmtkgyclgbllxogtvjerxwhyrojvrulnklkixknnmgbmszxulhyykhhacfckkoplddkkbzaukxpdumdiodrswbomdlzdiifatlupwvlikgvhxczjfkrsuafrlorweihjgnpyuenavkpykgbavsfktiiqpclfuvtcotwztqprwjfimrsqocjpjditxjsueslhdduqrguwybzkchgiroqchlrosjwcjucfhhorckvcfoesztzthmxyeupmyrtkwsaoouhmzsufrtycbufjjsdqmmfkldqagajdmpyrwrfkvxgldmgojomwcinwhssttfxyrngqdeoqxucukowmskdmrsruegekxdbrnmhuegngcqxzvmoypplxqgsfivquhfnkxsxqnczhiuflwnmigstdnavsxvvvuvxzmjizyvybvqevjdklmmohsmywgjvonqreydevnioygjmzanipawurjotdvpkaevviyvvqpqrzydqygcazvrwugnzhhclaibjgsvwglzgxfaqrdmzqoblitmsbbjwfltnusrpyupgcbrrtbuqgxylnuobrldpzxirbgkbvsmhavdhmfbpbdzwqtqaqbezjovitosmgyatluomurdzchrtihtmoegzxppaworfoinixhytalzhhxlwvbgzujfgfwjldpwtzlzunobgylqrncyvzbsixbytwffodqjyxnofydjmtvnlmovvrfduguzfldsvwwcrmgtqsmjlfatxsfjzgxdxleowodnovisqywbwpufltlzjlayxkfiuvkztdiafjhudwsvnjitziacoeyysukccvnjyqwrltbbclnyagfjbnukqpdpltyiesbzhmueyrwpontbreoigznxdexiqbfbiietnisupsmvicxknbirlydwpyntpuwmsfmkrmpzrlcmgnddsvnmfisokxfuirptbyioexvinhnxbnkuyabirdgbksfwenrycvpijtlrgsipgzcdboiqucqsrotwceqoscccttorsboixxpbkvxefcwxqcndfwthnbfdqkagzxcgrtykccrtvjocomxksgfvaplxmnmqxpclduuvmbawppnngiotplzfevrenbqjsubzaelsqhvkditlmcrokwbbhvhwkjnbcbehwukixwapkxxnxfweqmjbwozdbgbjvrdjvcdywxsfkdidpybqyluwtulkiohtvcnmbiqkwaivoahykztaioxdptyzdvlyrqpqcyrvdxvarkgzavsmqsqoyrpgbaezlaizrcjqdvzdqtnlolkvivbnhdmgcxgsshwkutdtzybbaajaxfcgzuukfajnjlpppypbqokctsrakdnqpkrqmkriwjcuvohidahrtrhhwrvktnbkubvuarfbnicneqylpzztsrcyeixvbtrtulzmhrzgsyicqpuaygszlhjfrhoqmuuuokokfvkqwuybctjnnyjcaazswajpdrrzpdcshvvzdudclbtbmgnghbagcaetwolegcjunmhoejnwfpgcudwvqzatvwdjnmppdrwhfxivolidkqghlwhevqyeeanookdbmjjywvecepwmsjlymkwvpxspibxjzgyqowowiaisinfqfcppfnniaqxbuywulcqtgktssixggzbhdlxarsjygjocsjkxirhlcqjhlhgacuxxdmrqrcagyqxktpuryxyczeghsxsikqnvuwnttnjylzxobxiblesdlzsadasfiufvtvpihgfvupuxctmxgteszzorodcdfrvvgbxjljgbxpoaenoofvkyyltfipddwxinawdszinxaeevgdhtkndnifjnvfduhzxhgckayrljpzdaqdjebxhjglrtcbspmfyejytbumftarlqqywiquybqwjzgubkloqtuwekrkdvjvzxbzdawbapnduxrexmqffkpbmwrzmxpyftkooiuhzqzepvjfzpubfffluepcorcyaklidaiqggvyqiqdyhhrdisraftvmefzxrxukmdkzzevwowvvpixswrovgyuxrvqewspesfqxacajyqvsbnbfhbxuerjzvpmqvsxolfqsqxfmezfhqptnreuxfhnzxmgylfllzopvrlvsrghwcwpdihmtcfyyextjvzcxdfqtklifzdeusjbvounkthxxwhriutmroplcmtpsmbvcqzusejiciatpqsfxqqhunlksdfqvwbgrgezcvgpiqcmtgkuzqsejuihajgxlojeylpnfswwxbtawmtnujybesbdkbirnrdnjwmpmcufpupumfqfckvpoikmrhgcpigbnrraqceqttqxgawlkpngqvqclqbaznnyowgczpmctvpgyfromviulyojygqoswrwlrmzrpbcjeqnawaxqbolaqufbomrljaiafsfkrgpzszzskqmtcdhokteeuduvwlcnhdltalnrxihyjwyvdwtqxpgszygzcmnfcuwmqrdlxcfbyigayuwfgyxuddcdyrpinhihkboysyfnbgjveictgmiuaydbpikfhaxhwtqxhqxldxlopdheggjyrhfxyuibjxonbdrzdetzfqwdrbalnvtcjcmpvekxctqiceuztktyxdwpuokuuqmdjqzejwhmxtjfeukeaucyafoqkoirweonjjgvdqibqbgngdaamnivomhajsnronalruppsyxxfyeqjvfrtwbeusepthjiatatuqzrdlqepqflbbrvwqkoeaomviqedsphrabmxamxdbogptvarwfrvunitolfyjhmwebmtvwmshxmyfgctvkcziaojmqrzgpfunkvanhazchxlwkkzqkcygnrqnnsmenmyzwxouaalwxuwggbvyhdgijfwaqrrodreltjguejgsfppklwzirzsmalbdmcntrrfzvstsqiuzypgtowutqlphsovjxbuqhjmvtsztqfkfpntoztovadhyekpwcehrawhqafvucldevctklvjtextviyirtppkysjoqsgympgyvozrqiwfxzyrpresisbcskjhafhqzfflgaaiyxqwlwdggukkqjdwquynrjhfdudamhtetzgpcjcwtqmttdjyyfmbifjhugsijmkidrvhovvjkwhwqvzrdyzygbhjjueyzrdlfdcbhatvwtvnqpmnvfanjdydxwzcwvuptswhxvhivazcliiiykmvlhqbgqhveklurcwvrtalohuydnvmajexultfoqgxjmcorumsbutlbryilkrxgerhgccdzijpsyvwhvbduhnckozbsakpqlenptrigxeqqwqzzwqnjhyelztzlrursohxwhxfagxauzzywzdgtpdwbxndrxcvildtmftybitwlykbrvhpqwvwqdqzjbrwpbhxhopxzmjhwegbdclywaaidrguuzxthgntrkbxrbobterundhzddevsclkygaumdeafnfheumpzhvkiyaxkfpaikjzpiveukjhhptjvwppsexbyjvkbaiyvegbrzivzrpzpjrnfznjkonadraylahanfrscphmhzazpranzbyfzvrocnadbzpdmccvpkdqhfnblubmwapdgxvqwveocfbrfoarjkqyqwypfczlclzbnstwbfbmkcuvbbakhfhibytutpgxagvyvusvgtudhxtjkmgonjwlumqkbxpbnkmkmeeufpjcsdkkhfxadhykslduwchjjmmkrhzwhnvzrabtyqbisitowvpvmatbjykmozwlxqzzikzrivueboujhftrjlyqqytgarrfjjackuwtffilqzkmwpdcucccixafnydlicivadiwthsfehidckoexajvubqxeusfwqtebieoyvlrsmvttjmfidnktnjshvagpxclfudqpmoruenmsaipqsaoukmxoxdheasupjvagpznnjpkugvahlyokrgkpsaexlxjzjislhywlbpbtvtviiavgpclddnnpttyhrqixqojlwhialyfchlwzoeeaurrijftbmexifoolldnbdttnvuxmcjwgjgrxlehiporcmqfjasllvzykmcpkdbbcauyxmtbnwdzyzwzeidxncaqyorganedpxowjxcoyqbsuekkcavfggqbrfxgrcaqmelwodoxzirvwslonuqihdxyymrmewxufeqwfwhiulgznxfbmeimftsvcpotmtsynhfbqnknjwggwtqceviikbebcwcwqllfzcjiiosisbfrzilwynbvngahyljcckksktbqpgokiqinxaatckwvseihmbpofdqhrwmcclbnskfofydwtujiunlodasbvtmautgelnsephvuhmfcsxjndwzaupadwaertpxmqjvmzbnjeeyqgkttdjqgmbennhiudlxxzkqnomgytuntrmpzaqtfjqapbxmuenynknllhokuqclgspfxaicgqckvethhgvpkyusmeliulquhjzshgleuanttzvwlekvtwdqvvggwhgfwnkppagjbngfgbmxgogpkkkfhfdlbneemvvfhghuqtriovqtbylmzrwwhpsbxsstyqsuvkdvnvrrgsjmdqltznobotlqzocjaciecasgkjxbdwitbxhvledpcyjrytppduneivcaehsfpyrlirprgyeprslsizhyuzvzrqcxltyslydethcsercwgojhbrymzsvdldedhorubbhdoedksyaxkygpqaooofvgoqyziijimrivfmvpdpeawdykbxtstqfvnczgwjbvstairchhtczhcqlpkldczlhetflhdccuhkkfvbxfuomhaqbjsesqegwixwsidvzrmqadyortgxfxcqfgmxkspytkqfwvxrhlxudmmwrwmrbnutdjtzvjspcunxshcukgwjppaaewgtkrqatzjzkybhvpnuzncxzlncmbsccumqjgwwgrgufclsftqqqaszekqbivboitgnqmvekkqtrkrbzftargtjjbxsujhhxzhppilpoczgdwncudjfakdsmgvqtvcarxstftqqvibrepylsadrmavmjzksuhyfswkpiqeehrrrtsjwvveibpuuiqauvpsjzfphrrbrwqpufanqodrxcrycchzjgshvrmfvezxlpabswurgmybjsppasuwffibctmzrtzvjlegvtctgcudhrggiqfdzwivgzasbrckrqxztfmsavfnrabnwwkpwybyhrnxgecbdeelfhzoblwtpxzokxhnucwzemwuoqpmlxxzroejnbpyjweimvrwhksmvpaegzfriblojsfsughbsuahobhbiifnoamhacvjooocfwashsisuswrtflovjeqzwmgquimawljzplrqkqtsqhhnbnmzbyjeapuqbkbsxmlzzlfystovsvuadbbrwvwzttwyrkuosqotxnosypynmncyszwqnutjgrwiacvhpxkzkasyeccndwgivqcryqvnhabqxmevtrvhbrvktbwvehjhomcijmetfwvkiufxlivsrtlincwhxcfxvdtzudvntwgptujsxfarpbcschirbvqanybullkeglpqlwlkbgdpvcckutamtqaaqmaltijafgrdiqqrcjqzalakkslawvafechvyjbshnhdpqhbelkguecpcpcqayregfbrzcvmkzlncuvtqbblnbajihdfaurmslkgxmlhcpcyopgzdbjwnjfgjprtzcxdtbntjtdgzperhtqejdodejqoklgpnixcegximpfmklrvsuoyzwdjoapjroalbgcctorplbzxnmbeprxghmlebosmiqciimcizxmxsxcemwbaivqyqpprpsytoykurnptoapwwwxmxcngilvauocoflnderjzgtsbsmgdpxjtpktocdwapnmorlkdxejlqiieeuhlipdfspbnywvhjhskehjenzcxminfpyvfbuscqitrvvmggotvpdxqpjnwektqrmxhuwvookxxamwqfaglrtsxfamzlmtmfhmkdnnwaeqlmmiacedtiabnhqmasmvqgqqhyokorakgsrbkovggghjxvmmszypwtdxacryttzmntzzhrozpncyomwejjsdvqpnkducrpkvgjddoyfxldpdphvofcqhnsifoequdgbcfaweemyjhuynfmxraloocvtopntieetsarmxxgrueocagfelbhevltedxgicdexxvohqoeigmgswdznjlxfdkxxtdnlhjmwbtvjxdgmvmutrxpsdxadodngwwcmnvkobkxrllevlydqrycevosjehrxiblnanixvfuqibjtldtqhuyepapgkewyhjxtrsgmvybigtgqvqhhodzcpsvawpmckcjnuydcvfabciicqqkqldxgbgerwuxegdeiltjukctwolgspbkgindoibxvtsvfgmievtfzlxyxieerracaopiqvknexevvwqvobzxcqyfiyhcucpvreuuphlmaahhfyijdsszqttpnobzacggifhedlypnrzvkidjilmecrgbjtlelivvysxkmilwkyjyfcogkogigfzmqriqzehdohvjqcfltmatzdbxwygfqmnvklbjlzijmeawrlwmiilhxeiuyabuqhbxljgebeiuxjngvmjvvgmgutgqhjubhdmeurkahmpxyxadpxkdetirtnnjiwylusazcjlvgttxkrklrxroiribihnmaiorreqcaolhhvixkveqzoyiyskamagjfbpvfxnflsgrnykgcpfzhgepaouynjxmifcioqluxwzwpmtjprkesvxuvtnoklwljbpucwzruqhxtvipbjdbsinwxeghxyspnaodgcqkgoatocqqpxqxmwliqngjamryzbayfqbgjtpxoehhtuvtrrtphignupyalifnpflttcdildohkmwtohxckhnwejonlzozbsejdtzfvxkoxsxckbwvdgtcxoregmhahnuptgvsoiyjbmbcgjwjluadppzpqyctnqvwaecrpujxtourfiihvrhmmgrcapyeyndlkysnyyztpihpjyubuhzztzbrlkqnoowzrsumuqkqsigodofwtjyyhrjrinfbzrhbqkbiuyruftsgxvithmbdqwrkktpkpqxbqidaqeydydrdkqiizwkyhuzksfwiwoznnxeciivnfiowgzovtlmgwryxebkfunnbmpzuornqlemqrugzrpvqxykrfvlihxgexlsaipgicgmwqajagmbxdbfkwlxssqlcyuhwzmnzvlspufgkilutcirhlagdmthtjmkbjvbjwyzntfhmkbtpuejwbmymfqbuebhhwkseijlaqaejrmptvtryktsthepxsoofjimjxtacfaxttqhcoiebwytwxwsibeecwhgcjjvoukksphgqptneuqmhvrjewlouephrcnriejanwcjvchteskafqkgmbqxqyzjikslkpzjmaqfhzmkakonpeatytfyyncslnflvivvxclv"
t =
492153482
nums =
[23,20,4,11,4,24,13,25,12,21,17,7,6,21,12,11,22,25,22,16,19,8,16,18,19,16]







*/
