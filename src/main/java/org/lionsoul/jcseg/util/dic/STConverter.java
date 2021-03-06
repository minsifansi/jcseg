package org.lionsoul.jcseg.util.dic;

import org.lionsoul.jcseg.util.IStringBuffer;

/**
 * Simplified and traditional chinese convert class.
 * 	all the search work base on {@link String#indexOf(int)}.
 * you may store all the words in a HashMap for the purpuse of a faster fetch.
 * 
 * @author chenxin <chenxin619315@gmail.com>
 */
public class STConverter {
	
	//simplified string.
	public static final String SIMSTR = "閿曠殤钄肩鐖卞棾瀚掔懛鏆ч湱璋欓摰楣岃偖琚勫ゥ濯獪槌屽潩缃㈤挴鎽嗚触鍛楅鍔炵粖閽ｅ府缁戦晳璋ゅ墺楗卞疂鎶ラ矋楦ㄩ緟杈堣礉閽＄媹澶囨儷楣庤床閿涚环绗旀瘯姣欏竵闂崪鍝旀粭閾嬬瓪璺歌竟缂栬船鍙樿京杈媱缂忕鏍囬獱椋戦闀栭暢槌旈硸鍒槳婵掓花瀹炬憟鍌х激妲熸鑶戦晹楂岄瑩楗肩鎷ㄩ挼閾傞┏楗介捁楣佽ˉ閽歌储鍙傝殨娈嬫儹鎯ㄧ伩楠栭华鑻嶈埍浠撴钵鍘曚晶鍐屾祴鎭诲眰璇ч敻渚挆鎼�幒铦夐璋楃紶閾蹭骇闃愰ⅳ鍐佽皠璋惰拠蹇忓┑楠ｈ绂呴暋鍦哄皾闀垮伩鑲犲巶鐣呬讥鑻屾�闃婇渤閽炶溅褰荤牀灏橀檲琛姬璋屾纰滈線鎾戠О鎯╄瘹楠嬫灗鏌介摉閾涚棿杩熼┌鑰婚娇鐐介ガ楦卞啿鍐茶櫕瀹犻摮鐣磋笇绛圭桓淇﹀副闆犳┍鍘ㄩ攧闆忕鍌ㄨЕ澶勫垗缁岃拱浼犻拸鐤棷鍒涙�閿ょ紞绾箲缁拌緧榫婅緸璇嶈祼楣氳仾钁卞洷浠庝笡鑻侀鏋炲噾杈忚箍绐滄捄閿欓攭楣捐揪鍝掗瀾甯﹁捶楠�粣鎷呭崟閮告幐鑳嗘儺璇炲脊娈氳禃鐦呯褰撴尅鍏氳崱妗ｈ盃鐮�鎹ｅ矝绁峰鐩楃剺鐏倱闀晫娑ら�缂旂贝璇嬭皼缁ㄨ闀濋鐐瑰灚鐢靛穮閽跨櫕閽撹皟閾卜璋嶅彔椴介拤椤堕敪璁㈤摛涓㈤摜涓滃姩鏍嬪喕宀介斧绐︾妸鐙璧岄晙娓庢鐗嶇瑑榛╅敾鏂紟绨栧厬闃熷鎬奸暒鍚ㄩ】閽濈倴瓒稿ず鍫曢搸楣呴璁规伓楗胯皵鍨╅槒杞攪閿烽箺棰氶槌勮鍎垮皵楗佃窗杩╅搾楦搁矔鍙戠綒闃�彁鐭鹃拻鐑﹁穿楗绾洪挮椴傞璇藉簾璐圭化闀勯脖绾峰潫濂嬫劋绮伨涓版灚閿嬮鐤啹缂濊鍑ゆ玻鑲よ緪鎶氳緟璧嬪璐熻濡囩細鍑└缁傜粙璧欓焊椴嬮硢閽嗚閽欑洊璧呮潌璧剁璧ｅ按鎿�粈鍐堝垰閽㈢翰宀楁垎闀愮澗璇扮紵閿嗘悂楦介榿閾釜绾ラ晧棰嶇粰浜樿祿缁犻矤榫氬宸╄础閽╂矡鑻熸瀯璐璇熺紤瑙忚泭椤捐瘋姣傞挻閿㈤釜楣勯箻鍓愭寕楦规幋鍏宠棣嗘儻璐瘱鎺奸钩槌忓箍鐘疯褰掗緹闂鸿建璇¤吹鍒藉對鍒垮Λ妗ч矐槌滆緤婊氳‘缁查钵閿呭浗杩囧煔鍛欏讣妞佽潏閾獓闊╂眽闃氱粭棰夊彿鐏忛ⅱ闃傞工璐鸿瘍闃栬泿妯桨楦跨孩榛夎鑽棾椴庡６鎶ゆ勃鎴锋祾楣曞摋鍗庣敾鍒掕瘽楠呮ˇ閾ф�鍧忔鐜繕缂撴崲鍞ょ棯鐒曟叮濂傜汲閿鹃博榛勮皫槌囨尌杈夋瘉璐跨Ы浼氱儵姹囪璇茬粯璇欒崯鍝曟祶缂嬬彶鏅栬崵娴戣棣勯槏鑾疯揣绁搁挰闀嚮鏈虹Н楗ヨ抗璁ラ浮缁╃級鏋佽緫绾ф尋鍑犺摕鍓傛祹璁¤闄呯户绾璇樿崰鍙藉摐楠ョ帒瑙婇綉鐭剁緛铏胯坊闇侀矚椴す鑽氶璐鹃捑浠烽┚閮忔祪閾楅晸铔叉鐩戝潥绗洪棿鑹扮紕鑼ф纰辩》鎷ｆ崱绠�凯鍑忚崘妲涢壌璺佃幢瑙侀敭鑸板墤楗笎婧呮锭璋忕迹鎴嬫埇鐫戦梗绗曢玻闉皢娴嗚拫妗ㄥ璁查叡缁涚及鑳舵祰楠勫▏鎼呴摪鐭茎鑴氶ズ缂寸粸杞胯緝鎸㈠长楣矝闃惰妭娲佺粨璇眾鐤栭椴掔揣閿︿粎璋ㄨ繘鏅嬬儸灏藉姴鑽嗚寧鍗鸿崺棣戠紮璧嗚椴告儕缁忛闈欓暅寰勭棄绔炲噣鍒尘杩冲吉鑳潛绾犲帺鏃ч槃楦犻公椹逛妇鎹敮鎯у墽璁靛宝姒夐閽滈敂绐緝楣冪虎閿╅晫闅借鍐崇粷璋茬弿閽у啗楠忕毑寮�嚡鍓�灢蹇炬伜閾犻敶榫涢椂閽搻棰楀３璇鹃獟缂傝讲閽堕敒棰斿灕鎭抽緢閾挎姞搴撹￥鍠惧潡渚╅儛鍝欒剭瀹界嫰楂嬬熆鏃峰喌璇撹閭濆湽绾╄炊浜忓部绐ラ婧冨尞钂夋劍鑱╃瘧闃冮敓椴叉墿闃旇洿铚¤厞鑾辨潵璧栧磧寰曟稙婵戣祲鐫愰摷鐧炵眮钃濇爮鎷︾闃戝叞婢滆鞍鎻借鎳掔紗鐑傛互宀氭鏂撻暓瑜寸悈闃嗛敀鎹炲姵娑濆敔宕傞搼閾圭棬涔愰硴闀瀿绫绘唱璇旂姬绡辩嫺绂婚菠绀间附鍘夊姳鐮惧巻娌ラ毝淇儲鍧滆媹鑾呰摖鍛栭�楠婄肌鏋ユ爭杞圭牶閿傞箓鐤犵矟璺為洺椴￠尝淇╄仈鑾茶繛闀版�娑熷笜鏁涜劯閾炬亱鐐肩粌钄瑰娼嬬悘娈撹＂瑁ｉ并绮噳涓よ締璋呴瓑鐤楄窘闀ｇ辑閽岄供鐚庝复閭婚碁鍑涜祦钄哄华妾╄練韬忛緞閾冪伒宀缁铔忛伯棣忓垬娴忛獫缁洪晱楣ㄩ緳鑱嬪挋绗煎瀯鎷㈤檱鑼忔撤鐝戞爦鑳х牷妤煎▌鎼傜瘬鍋昏拰鍠藉禎闀傜槝鑰ц澕楂呰姦鍗㈤搴愮倝鎺冲崵铏忛瞾璧傜褰曢檰鍨嗘捀鍣滈椌娉告笇鏍屾┕杞宠緜杈樻皣鑳脯楣埢椴堝肠鎸涘婊︿贡鑴斿▓鏍鹃妇閵姟杞鸡浠戞拨绾惰鍥佃悵缃楅�閿ｇ楠￠獑缁滆崷鐚℃澈妞よ劧闀欓┐鍚曢摑渚ｅ薄缂曡檻婊ょ豢姒堣閿婂憭濡堢帥鐮佽殏椹獋鍚楀敍瀣锋潻涔伴害鍗栬繄鑴夊姠鐬掗铔弧璋╃鸡闀橀ⅰ槌楃尗閿氶搯璐搁航娌￠晛闂ㄩ椃浠壀鐒栨噾閽旈敯姊︾湳璋滃讥瑙呭箓鑺堣哀鐚曠ア缁电紖娓戣吋榛惧簷缂堢吉鐏偗闂介椀缂楅福閾艾璋熻摝棣嶆畞闀嗚皨浜╅捈鍛愰挔绾抽毦鎸犺剳鎭奸椆閾欒棣佸唴鎷熻吇閾岄驳鎾佃緡椴堕吙楦熻寫琚呰亗鍟晩闀嶉櫑铇栧棲棰熻箲鏌犵嫗瀹佹嫥娉炶嫀鍜涜亶閽航鑴撴祿鍐滀粳鍝濋┙閽曡鍌╃枱娆ч弗娈村憰娌よ鎬勭摨鐩樿箳搴炴姏鐤辫禂杈斿柗楣忕喊缃撮搷楠楄皾楠堥缂ラ璐珨鑻瑰嚟璇勬臣棰囬拫鎵戦摵鏈磋氨闀ら暔鏍栬剱榻愰獞宀傚惎姘斿純璁暡楠愮划妗ょ棰�槌嶇壍閽庨搮杩佺璋﹂挶閽虫綔娴呰按鍫戜渐鑽ㄦ偔楠炵急妞犻挙鏋憶澧欒敺寮烘姠瀚辨ǒ鎴楃倽閿栭數闀緹璺勯敼妗ヤ箶渚ㄧ繕绐嶈璋崬缂茬璺风獌鎯敳绠ч挦浜插瘽閿撹交姘㈠�椤疯搴嗘徔椴惣绌疯寱铔卞矾璧囪櫘槌呰秼鍖鸿函椹遍緥璇庡矕闃掕楦查ⅶ鏉冨姖璇犵换杈侀摠鍗撮箠纭槙闃欐偒璁╅ザ鎵扮粫鑽涘▎妗＄儹闊ц绾オ杞崳缁掑禈铦剧紱閾烽ⅵ杞攼铓棸娑︽磼钀ㄩ槌冭禌浼炴绯佷抚楠氭壂缂订鍟摨绌戞潃鍒圭罕閾╅波绛涙檼閰惧垹闂檿璧＄籍璁楠熼拹槌濆浼よ祻鍨ф畤瑙炵儳缁嶈祳鎽勬厬璁惧帊婊犵暡缁呭濠惰偩娓楄瘻璋傛笘澹扮怀鑳滃笀鐙箍璇楁椂铓�疄璇嗛┒鍔块�閲婇グ瑙嗚瘯璋ュ煒鑾冲紤杞艰闯閾堥播瀵垮吔缁舵灑杈撲功璧庡睘鏈爲绔栨暟鎽呯壕甯呴棭鍙岃皝绋庨『璇寸鐑侀搫涓濋ゲ鍘┓缂岄敹楦惰�鎬傞璁艰鎿炶柈棣婇閿艰嫃璇夎們璋＄ǎ铏介殢缁ュ瞾璋囧瓩鎹熺瑡鑽嫴缂╃悙閿佸敘鐫冪嵀鎸為椉閾婇硯鍙版�閽涢矏鎽婅椽鐦哗鍧涜碍璋堝徆鏄欓捊閿「姹ょ儷鍌ラェ閾撮晽娑涚沪璁ㄩ煬閾借吘瑾婇攽棰樹綋灞夌紘楣堥槜鏉＄矞榫嗛拨璐撮搧鍘呭惉鐑冮摐缁熸伕澶撮挱绉冨浘閽嶅洟鎶熼铚曢エ鑴遍傅椹┘妞榧嶈濞茶吔寮咕椤戒竾绾ㄧ痪缃戣緥闊﹁繚鍥翠负娼嶇淮鑻囦紵浼含璋撳崼璇垮笍闂辨博娑犵幃闊倻椴旀俯闂荤汗绋抽棶闃岀摦鎸濊湕娑＄獫鍗ц幋榫屽憸閽ㄤ箤璇棤鑺滃惔鍧為浘鍔¤閭簯鎬冨Ι楠涢箟楣滈敗鐗鸿涔犻摚鎴忕粏楗╅構鐜鸿铏捐緰宄′緺鐙帵鍚撶椴滅氦璐よ闂叉樉闄╃幇鐚幙棣呯尽瀹嚎鑻嬭幎钘撳矘鐚冨ù楣囩棲铓濈奔璺瑰帰闀朵埂璇﹀搷椤硅姉楗烽缂冮（钀у殻閿�檽鍟稿摀娼囬獊缁℃灜绠崗鎸熸惡鑳佽皭鍐欐郴璋旱鎾风粊缂攲琛呭叴闄夎崶鍑舵惫閿堢唬棣愰负铏氬槝椤昏鍙欑华缁椤艰僵鎮�鐧ｇ粴璋栭搲闀熷璋戞扯槌曞媼璇㈠椹璁�鍩欐禂椴熷帇楦﹂腑鍝戜簹璁跺灜濞呮姘╅槈鐑熺洂涓ュ博棰滈槑鑹冲帉鐮氬溅璋氶獙鍘ｈ禎淇ㄥ厲璋虫伖闂吔榄囬榧归腐鏉ㄦ壃鐤￠槼鐥掑吇鏍风個鐟舵憞灏ч仴绐戣埃鑽胶楣為硱鐖烽〉涓氬彾闈ヨ皰閭烘檾鐑ㄥ尰閾遍閬椾华铓佽壓浜垮繂涔夎璁皧璇戝紓缁庤瘨鍛撳硠楗存�椹跨饥杞惰椿閽囬晵闀辩槜鑸ｈ崼闃撮摱楗殣閾熺樉妯卞┐楣板簲缂ㄨ幑钀よ惀鑽ц潎璧㈤鑼旇幒钀﹁摜鎾勫槫婊㈡絾鐠庨功鐦块缃傚摕鎷ヤ剑鐥堣笂鍜忛暃浼樺咖閭搥鐘硅鑾搁摃楸胯垎楸兼笖濞变笌灞胯鐙辫獕棰勯┉浼涗浚璋�皶钃ｅ禌楗槇濡骸瑙庢閽伴箚楣緣楦虫笂杈曞洯鍛樺渾缂樿繙姗奸涪榧嬬害璺冮挜绮ゆ偊闃呴捄閮у寑闄ㄨ繍钑撮厺鏅曢煹閮撹姼鎭芥劆绾煫娈掓安鏉傜伨杞芥敀鏆傝禐鐡掕侗閷捐祪鑴忛┑鍑挎灒璐ｆ嫨鍒欐辰璧滃暓甯荤璐艰爱璧犵患缂涧閾￠椄鏍呰瘓鏂嬪�姣＄洀鏂╄緱宕爤鎴樼唤璋靛紶娑ㄥ笎璐﹁儉璧佃瘡閽婅洶杈欓敆杩欒蔼杈勯恭璐為拡渚﹁瘖闀囬樀娴堢紲妗㈣礁璧堢ク楦╂專鐫佺嫲浜夊抚鐥囬儜璇佽宄ラ挷閾瓭缁囪亴鎵х焊鎸氭幏甯滆川婊為獦鏍夋爛杞佃骄璐介阜铔崇捣韪腐瑙挓缁堢鑲夸紬閿鸿瘜杞寸毐鏄奸绾ｇ粔鐚璇涚儧鐬╁槺璐摳椹讳极妲犻摙涓撶爾杞禋鍟棰炴々搴勮濡嗗．鐘堕敟璧樺潬缂�獡缂掕皢鍑嗙潃娴婅闀吂璧勬笉璋樼紒杈庤祤鐪﹂敱榫囬不韪�绾靛伂閭硅椹洪舶璇呯粍闀為捇缂佃簻槌熺勘骞跺崪娌変笐娣�凯鏂楄寖骞茬殝纭呮煖鍚庝紮绉告澃璇�じ閲屽噷涔堥湁鎹诲噭鎵﹀湥灏告姮娑傛醇鍠傛薄閿ㄥ捀铦庡綕娑屾父鍚佸尽鎰垮渤浜戠伓鎵庢湱绛戜簬蹇楁敞鍑嬭疇璋儎鍕愬嚰鍧傚瀰鍨村煰鍩濊嫎鑽嵁鑾滆幖鑿拌梺鎻稿悞鍚ｅ挃鍜濆挻鍣樺櫦鍤篂宀欏荡褰峰炯鐘哥媿棣�棣撻鎰ｆ喎鎳斾脯婧嗘粺婧锋激娼存竟鐢簾缁旂槐鐝夋灖妗婃妲旀━杞辫椒璧嶈偡鑳ㄩ鐓崇厖鐔樻剭娣肩牅纾欑湇閽氶挿閾橀摓閿冮攳閿庨攺閿橀敐閿敨閿块晠闀庨暍闀ラ暕闀茬▎楣嬮箾楣辩柆鐤寸棖鐧％瑗佽�棰ヨ灗楹撮矃椴嗛矅椴為泊椴洪布槌婇硧槌橀硻闉掗灤榻 ";
	
	//traditional string.
	public static final String TRASTR = "閷掔殮钘圭鎰涘櫙瀣＄挦鏇栭潉璜抽姩榈瑗栧ェ濯奸﹣榘插）缃烽垁鎿烘晽鍞勯爳杈︾祮閳戝公缍侀帄璎楀墲椋藉鍫遍畱榇囬綑杓╄矟閶囩嫿鍌欐唺榈硜閷涚箖绛嗙暍鏂冨梗闁夎摻鍡舵椒閴嶇韫曢倞绶ㄨ捕璁婅警杈姁绶剁暴妯欓﹥棰閺㈤懀榘鹃眽鍒ョ櫉鐎曟勘璩撴摨鍎愮菇妾虫鑷忛憣楂曢椁呯鎾ョ冀閴戦椁戦埜榈撹閳借病鍙冭牰娈樻厷鎱樼嚘椹傞徊钂艰墮鍊夋粍寤佸伌鍐婃脯鎯诲堡瑭崵鍎曢嚨鏀欐懟锜璁掔簭閺熺敘闂￠～鍥呰珎璁栬晢鎳哄瑡椹忚绂悢鍫村槜闀峰劅鑵稿粻鏆㈠�钀囨偟闁堕閳旇粖寰圭〃濉甸櫝瑗倴璜舵纾ｉ綌鎾愮ū鎳茶獱楱佹妾夐嫯閻虹櫋閬查Τ鎭ラ綊鐔鹃－榇熸矕琛濊煵瀵甸妰鐤囪簥绫岀盯鍎斿宫璁庢寤氶嫟闆涚鍎茶Ц铏曡娀绲�簳鍌抽嚙鐦￠棖鍓垫劥閷樼稙绱旈秹缍借紵榻经瑭炶硿槎胯伆钄ュ洩寰炲彚钃﹦妯呮箠杓宠亥绔勬敍閷娂楣洪仈鍣犻焹甯惰哺椐樼纯鎿斿柈閯叉挘鑶芥啔瑾曞綀娈厂鐧夌盀鐣舵搵榛ㄨ暕妾旇疁纰鎼楀扯绂卞皫鐩滅嚲鐕堥劎閻欐暤婊岄仦绶犵炒瑭嗚缍堣閺戦榛炲闆诲窋閳跨櫜閲ｈ閵氶瘺璜滅枈榘堥嚇闋傞尃瑷傞媽涓熼姪鏉卞嫊妫熷噸宕犻秶绔囩姠鐛ㄨ畝璩崓鐎嗘珴鐗樼榛烽崨鏂风窞绫厡闅婂皪鎳熼悡鍣搁爴閳嶇噳韬夊オ澧惛榈濋瑷涙儭椁撹鍫婇柤杌涢嫧閸旈稓椤庨楸疯獟鍏掔埦椁岃渤閭囬壓榇疄鐧肩桨闁ョ惡绀嚛鐓╄博椋í绱￠垇榄撮瑾瑰虎璨荤穻閻ㄩ绱涘⒊濂啢绯炲儴璞愭閶掗ⅷ鐦嬮Ξ绺槌崇亙鑶氳蓟鎾紨璩﹀京璨犺▋濠︾笡槌ч绱辩醇璩婚憨楫掗皰閲撹┎閳ｈ搵璩呮】瓒曠▓璐涘胺鎼熺春宀″墰閶肩侗宕楁垏閹潽瑾ョ笧閶摫榇块枺閴诲�绱囬帢娼佺郸浜欒场缍嗛瘉榫斿闉忚并閴ゆ簼鑼嶆璩煎瑭繁瑕牨椤ц﹣杞傞埛閷矗榈犻痘鍓帥榇版憫闂滆椁ㄦ叄璨┛鎽滈笡榘ュ唬鐛疯姝搁緶闁ㄨ粚瑭泊鍔婂尛鍔屽妾滈楸栬讥婊捐绶勯瘈閸嬪湅閬庡牆鍜煎箺妲ㄨ焾閴块Л闊撴饥闂炵祹闋¤櫉鐏濋ˉ闁￠洞璩�ǘ闂旇牐姗綗榇荤磪榛岃▽钁掗枎楸熷：璀锋滑鎴舵桓槎樺槱鑿暙鍔冭┍椹婃ê閺垫嚪澹炴鐠伴倓绶╂彌鍠氱槗鐓ユ笝濂愮汞閸伴瘒榛冭瑠榘夋彯杓濇瘈璩勭鏈冪嚧鍖瑾ㄧ躬瑭艰枅鍣︽井绻㈢惪鏆夎懛娓捐椁涢柦鐛茶波绂嶉垾閼婃搳姗熺楗戣贰璀忛洖绺剧窛妤佃集绱氭摖骞捐枈鍔戞繜瑷堣闅涚辜绱�◥瑭拌柡鍢板殞椹ョ挘瑕綇纾緢锠嗚簨闇介杯榀藉ぞ鑾㈤牥璩堥墍鍍归閮熸倒閶忛幍锜鐩ｅ爡绠嬮枔鑹辩窐绻鍫块辜鎻�捒绨″剦娓涜枽妾婚憭韪愯长瑕嬮嵉鑹﹀妽椁炴几婵烘緱璜笐鎴旀埄鐬奸都绛ч肮闊夊皣婕胯敚妲崇崕璎涢啲绲抽焷鑶犳締椹曞瑢鏀壐鐭儱鑵抽绻崇禐杞庤純鎾熷稜榉﹂闅庣瘈娼旂祼瑾″眴鐧ら牅楫氱穵閷﹀儏璎归�鏅夌嚰鐩″媮鑽婅帠宸硅棊楗夌笁璐愯Σ榀ㄩ缍撻牳闈滈彙寰戠棛绔跺噲鍓勬秶閫曞汲鑴涢潥绯惧粍鑸婇槌╅凡椐掕垑鎿氶嫺鎳煎妵瑭庡报娅搁⒍閴呴嫤绐堕綗榈戠倒閷堥惈闆嬭姹虹禃璀庣帹閳炶粛椐跨毟闁嬪嚤鍓村鎰炬劮閹ч崌榫曢枌閳ч姮椤嗘瑾查◢绶欒换閳抽寔闋峰⒕鎳囬溅閺楁懗搴げ鍤冲鍎堥劧鍣茶喚瀵崻楂栫う鏇犳硜瑾嗚獞閯哄绾婅埠铏у穻绐洪娼板尡钑㈡啋鑱电埃闁寱榀ゆ摯闂婅爯锠熻嚇钀婁締璩村磵寰犳范鐎ㄨ硽鐫為尭鐧╃睙钘嶆瑒鏀旂眱闂岃槶鐎捐畷鏀鎳剁簻鐖涙揩宓愭瑬鏂曢懎瑗ょ懐闁媰鎾堝嫗婢囧槷宥楅姞閻掔檰妯傞俺閻冲椤炴窔瑾勭覆绫矋闆㈤瘔绂簵鍘插嫷绀鐎濋毟鍎烽厛澹㈣椂钂炶樅鍤﹂倫椹腑娅珶杞㈢お閶伴笣鐧樼巢韬掗潅楸洪抱鍊嗚伅钃�閻啇婕ｇ熬鏂傝噳閺堟垁鐓夌反铇炲ォ鐎茬拤娈こ瑗濋氨绯ф都鍏╄紱璜掗瓗鐧傞伡閻愮箽閲曢矾鐛佃嚚閯伴睏鍑滆硟钘哄哗妾佽綌韬健閳撮潏宥洪牁缍炬瑸锜堕椁惧妷鐎忛ó缍归帵榉氶緧鑱惧毃绫犲鏀忛毚铇㈢�鐡忔鏈хけ妯撳﹣鎽熺皪鍍傝敒鍢嶅秮閺ょ樅鑰灮楂忚槅鐩ч”寤垚鎿勯沟铏滈璩傜タ閷勯櫢澹氭摷鍤曢柇鐎樻伐娅ㄦ珦杞よ紖杞嗘皩鑷氶笗榉鸿壂楸稿窉鏀ｅ鐏や簜鑷犲瓕娆掗笧閼炬巹杓�渚栨藩缍歌珫鍦囪樋缇呴倧閼肩碑楱鹃П绲＄姈鐜�考娆忚叀閺嶉鍛傞媮渚跺雹绺锋叜婵剧稜娅氳じ閶濆樃濯界應纰艰灋棣降鍡庡槣瀣ゆΚ璨烽亥璩ｉ倎鑴堝嫳鐬為锠绘豢璎剧傅閺濋榘昏矒閷ㄩ墯璨块杭娌掗巶闁�偠鍊戞崼鐕滄嚕閸嗛尦澶㈢瀲璎庡綄瑕撳啰缇嬭瑦鐛肩Π缍跨番婢犻潶榛藉粺绶茬箚婊呮啱闁╅枖绶￠炒閵樿璎ㄩ﹢楗冩閺岃瑎鐣濋壃鍚堕垑绱嶉洠鎾撹叇鎯遍閻冭ē椁掑収鎿啯閳鏀嗚鸡榀伴噣槌ヨ敠瑁婅伓鍤欓懛閹抽殙铇楀泚椤㈣骸妾哥嵃瀵ф摪婵樿嫥鍤�伖閳曠磹鑶挎績杈插剛鍣ラ閲硅鍎虹槯姝愰窏姣嗗様婕氳鎱攲鐩よ梗榫愭媼鐨拌碃杞″櫞榈磿缇嗛埞楱欒珵椐㈤绺归牷璨у铇嬫啈瑭曟綉闋楅嚈鎾查嫪妯歌瓬閺烽悹妫茶噸榻婇◣璞堝暉姘ｆ瑷栬槃楱忕逗姒跨＇闋庨爮榘壗閲墰閬风敖璎欓將閴楁經娣鸿濉瑰儔钑佹叧楱咕妲ч垚妲嶅梿澧昏枖寮锋惗瀣欐鎴х啑閷嗛彉閺圭茎韫岄崿姗嬪柆鍍戠抗绔呰獨璀欒晭绻扮＝韫虹珚鎰滈崶绡嬫瑕閶熻紩姘偩闋冭珛鎱舵挸榀栫搳绐參铔哄钒璩曡煟榘嶈定鍗�粈椹呴讲瑭樺秶闂冭Ψ榇濋〈娆婂嫺瑭叮杓囬姄鍗婚挡纰洪棆闂曟劏璁撻鎿剧篂钑樺瑘姗堢啽闊岃獚绱夐＊杌旀Ξ绲ㄥ陡锠戠笩閵ｉ“杌熼姵铚嗛枏娼ょ亼钖╅榘撹辰鍌樻绯濆柂楱锋巸绻呮線鍡囬姭绌℃鍓庣礂閹╅瘖绡╂洭閲冨埅闁冮櫆璐嶇箷瑷曞楱搁嚖楸斿鍌疯碁鍧版瑙寸噿绱硅硳鏀濇嚲瑷帣鐏勭暚绱冲瀣歌厧婊茶┑璜楃�鑱茬供鍕濆斧鐛呮繒瑭╂檪铦曞璀橀鍕㈤仼閲嬮＞瑕栬│璎氬钂斿紥杌捐舶閳伴埃澹界嵏缍杓告浉璐栧爆琛撴ü璞庢暩鏀勭磽甯ラ杺闆欒绋呴爢瑾ⅸ鐖嶉憼绲查＜寤濋绶﹂嵍榉ヨ伋鎱爩瑷熻鎿昏棯椁块⒓閹槆瑷磋倕璎栫闆栭毃缍忔瑾跺鎼嶇瓖钃�尰绺懀閹栧棭鑴х嵑鎾婚棩閴堥皑鑷烘厠閳﹂異鏀よ勃鐧辩仒澹囪瓪璜囧槅鏇囬壄閷熼爣婀嚈鍎婚こ閻嬮彍婵ょ党瑷庨煖閶遍ò璎勯娀椤岄珨灞滅饭榈滈棎姊濈扯榻犻胺璨奸惖寤宠伣鐑撮妳绲辨厽闋垊绂垮湒閲峰湗鎽堕牴铔婚）鑴磿棣遍姗㈢睖榧夎オ濯ц唭褰庣仯闋戣惉绱堢栋缍茶紴闊嬮仌鍦嶇偤婵扮董钁﹀亯鍋界矾璎傝璜夊箖闂堟簣娼跨憢闊欑厭楫韩鑱炵磱绌╁晱闁跨敃鎾捐澑娓︾鑷ヨ惖榻峰棜閹㈢儚瑾ｇ劇钑惓濉㈤湩鍕欒閯斿弧鎲楱栭怠槎╅尗鐘цゲ缈掗姂鎴茬窗椁奸鐠借Α铦﹁絼宄戒繝鐙瑰粓鍤囩·楫簴璩㈤姕闁戦’闅従鐛荤福椁＄鲸鎲茬窔鑾ц枱铇氬炒鐛榉寸檱锠旂韬氬粋閼查剦瑭抽熆闋呰枌椁夐─绶楅钑泜閵锋泬鍢樀鐎熼缍冩绨崝鎸炬敎鑴呰瀵�璎濊せ鎿风床绾堥媴閲佽垐闄樻粠鍏囨炊閵圭埂楗堥祩铏涘檽闋堣ū鏁樼窉绾岃闋婅粧鎳搁伕鐧耽璜奸墘閺囧璎旀京楸堝嫑瑭㈠皨棣磋〒瑷婇仠濉ゆ蒋楸樺榇夐川鍟炰簽瑷濆煛濠姘柟鐓欓菇鍤村窎椤忛柣鑹峰幁纭渐璜洪鍘磋礂鍎煎厳璁炴嚚闁嗛噮榄橀榧撮处妤婃彋鐦嶉櫧鐧㈤妯ｇ叕鐟ゆ悥鍫仚绐瑺钘ヨ缓榉傞癌鐖洪爜妤憠闈ㄨ瑏閯存泟鐕侀啱閵ラ牑閬哄剙锜昏棟鍎勬喍缇╄璀拌璀暟绻硅鍥堝锭椋存噷椹涚笂杌艰步閲旈幇閻跨槥鑹よ敪闄伴妧椋查毐閵︾櫘娅诲榉规噳绾撶懇铻㈢嚐鐔掕爡璐忕濉嬮动绺堥帲鏀栧毝鐎呯�鐡旈笟鐧牔缃屽柌鎿佸偔鐧拌复瑭犻彏鍎唫閮甸埦鐚惰獦钑曢姫榄疯伎榄氭紒濞涜垏宥艰獮鐛勮闋愰Ν鍌翠縼璜涜钑峰闯椋柧瀚楃磫瑕︽瓱閳洪祾榉搁浆榇涙返杞呭湌鍝″湏绶ｉ仩娅為扯榛跨磩韬嶉懓绮垫倕闁遍墳閯栧嫽闅曢亱铇婇啚鏆堥熁閯嗚晸鎯叉厤绱滈煘娈炴俺闆滅伣杓夋敘鏆磰鐡氳恫閺ㄨ磽鑷熼閼挎璨搰鍓囨兢璩惧槚骞樼皜璩婅瓥璐堢稖绻掕粙閸橀枠鏌佃榻嬪偟姘堢洖鏂季宥勬＇鎴扮痘璀嫉婕插赋璩劰瓒欒閲楄焺杞嶉嵑閫欒杓掗窊璨為嚌鍋佃ê閹櫍婀炵笣妤ㄨ猾璩戠榇嗘帣鐫滅寵鐖箑鐧ラ劖璀夎珝宕㈤墻閷氱畯绻旇伔鍩风礄鎽摬骞熻唱婊ō娅涙杌硅紛璐勯窓铻勭付韬撹簯瑙堕悩绲傜ó鑵溇閸捐瑓杌哥毢鏅濋绱傜笎璞瑾呯嚟鐭氬洃璨憚椐愪絿娅ч姈灏堢杞夎澈鍥�椤虫▉鑾婅濡濆／鐙�寪璐呭缍撮▍绺嬭珓婧栬憲婵佽珣閻茶尣璩囨棘璜穱杓滆膊鐪ラ寵榻滈瘮韫ょ附绺卞偗閯掕珡楱堕瑭涚祫閺冮墕绾樿害楸掔亢涓﹁敂娌堥啘婢卞彔楝ョ瘎骞硅嚡鐭芥珒寰屽ぅ绋倯瑷ｈ獓瑁忔珐楹介淮鎾氭窉鎵¤仏灞嶆摗濉楃椁垫睓閸侀构锠嶅綔婀ч亰绫茬Ζ椤樺督闆茬珗绱妱绡夋柤瑾岃ɑ闆曡▉璀鹃儰鐚涙肮闃鍫栧灥澧婃钑掕懁钃ц挀鑿囨鎽ｅ挙鍞氬摙鍣濆檯鎾呭妶璎旇宥磋剨浠垮儱鐛侀簠椁橀し楗婇ア妤炴�鎳嶇埧婕电仼娣锋揩鐎︽贰瀵х掣绲濈窋鐟夋妫姗版杌茶护璩唩鑵栭绯婄厗婧滄梗娓虹⒏婊剧灅閳堥墪閶ｉ姳閶ラ嫸閻﹂惂閸╅崁閸冮寚閹勯巼閹块悵閼ラ懝閼旂┉槎撻顶楦岀櫑灞欑槀鑷掕绻堣�椤煄楹畞楫冮畮榀楅瘽榀撮睗榀块盃榘甸眳闉介煗榻";
	
	/**
	 * convert the simplified words to traditional words
	 * 	of the specified string.
	 * 
	 * @param	str
	 * @return	String
	 */
	public static String SimToTraditional( String str ) {
		StringBuffer sb = new StringBuffer();
		int idx;
		for ( int j = 0; j < str.length(); j++ ) 
		{
			if ( (idx = SIMSTR.indexOf(str.charAt(j))) != -1 )
				sb.append(TRASTR.charAt(idx));
			else
				sb.append(str.charAt(j));
		}
		
		return sb.toString();
	}
	
	public static void SimToTraditional( String str, IStringBuffer isb ) {
		int idx;
		for ( int j = 0; j < str.length(); j++ ) 
		{
			if ( (idx = SIMSTR.indexOf(str.charAt(j))) != -1 )
				isb.append(TRASTR.charAt(idx));
			else
				isb.append(str.charAt(j));
		}
	}
	
	/**
	 * convert the traditional words to simplified words.
	 * 	of the specified string.
	 * 
	 * @param	str
	 * @return	String
	 */
	public static String TraToSimplified( String str ) {
		StringBuffer sb = new StringBuffer();
		int idx;
		for ( int j = 0; j < str.length(); j++ ) 
		{
			if ( (idx = TRASTR.indexOf(str.charAt(j))) != -1 )
				sb.append(SIMSTR.charAt(idx));
			else
				sb.append(str.charAt(j));
		}
		return sb.toString();
	}
	
	public static void TraToSimplified( String str, IStringBuffer isb ) {
		int idx;
		for ( int j = 0; j < str.length(); j++ ) 
		{
			if ( (idx = TRASTR.indexOf(str.charAt(j))) != -1 )
				isb.append(SIMSTR.charAt(idx));
			else
				isb.append(str.charAt(j));
		}
	}
}
