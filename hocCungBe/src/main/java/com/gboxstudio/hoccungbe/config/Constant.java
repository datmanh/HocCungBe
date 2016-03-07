package com.gboxstudio.hoccungbe.config;

import android.content.Context;
import android.media.MediaPlayer;

import com.gboxstudio.hoccungbe.R;


public class Constant {
	// Media
	public static MediaPlayer mediaPlayer = null;
	
	private static int musicBackground = R.raw.bg_song;
	
	public static void initMusic(Context context) {
		mediaPlayer = MediaPlayer.create(context, Constant.musicBackground);
		mediaPlayer.setLooping(true);
		mediaPlayer.start();
	}
	
	public static int audioLetter[] = new int[] {
		R.raw.a_letter,
		R.raw.a1_letter,
		R.raw.a2_letter,
		R.raw.b_letter,
		R.raw.c_letter,
		R.raw.d_letter,
		R.raw.d1_letter,
		R.raw.e_letter,
		R.raw.e1_letter,
		R.raw.g_letter,
		R.raw.h_letter,
		R.raw.i_letter,
		R.raw.k_letter,
		R.raw.l_letter,
		R.raw.m_letter,
		R.raw.n_letter,
		R.raw.o_letter,
		R.raw.o1_letter,
		R.raw.o2_letter,
		R.raw.p_letter,
		R.raw.q_letter,
		R.raw.r_letter,
		R.raw.s_letter,
		R.raw.t_letter,
		R.raw.u_letter,
		R.raw.u1_letter,
		R.raw.v_letter,
		R.raw.x_letter,
		R.raw.y_letter,
		
	};
	
	public static int audioLetterEng[] = new int[] {
		R.raw.a_eng,
		R.raw.b_eng,
		R.raw.c_eng,
		R.raw.d_eng,
		R.raw.e_eng,
		R.raw.g_eng,
		R.raw.h_eng,
		R.raw.i_eng,
		R.raw.k_eng,
		R.raw.l_eng,
		R.raw.m_eng,
		R.raw.n_eng,
		R.raw.o_eng,
		R.raw.p_eng,
		R.raw.q_eng,
		R.raw.r_eng,
		R.raw.s_eng,
		R.raw.t_eng,
		R.raw.u_eng,
		R.raw.v_eng,
		R.raw.x_eng,
		R.raw.y_eng
	};
	
	public static int audioWord[][] = new int[][] {
		{ R.raw.caica ,R.raw.conca_word ,R.raw.laban ,R.raw.ngoinha },
		
		{ R.raw.chieckhan ,R.raw.nguavan ,R.raw.thanlan ,R.raw.traibap },
		
		{ R.raw.caican ,R.raw.dammay ,R.raw.duahau_word ,R.raw.quadau },
		
		{ R.raw.bongda ,R.raw.conbo ,R.raw.conbuom ,R.raw.honbi },
		
		{ R.raw.caocao ,R.raw.concao ,R.raw.conco ,R.raw.concua },
		
		{ R.raw.caydu ,R.raw.conde_word ,R.raw.doidep ,R.raw.duongcam },
		
		{ R.raw.cayda ,R.raw.condo ,R.raw.dadieu ,R.raw.honda },
		
		{ R.raw.banhxe ,R.raw.chimse_word ,R.raw.hoasen ,R.raw.xedap_word },
		
		{ R.raw.condieu ,R.raw.conech_word ,R.raw.ocsen ,R.raw.tegiac },
		
		{ R.raw.caighe ,R.raw.conga_word ,R.raw.nhaga ,R.raw.viengach },
		
		{ R.raw.chuhe ,R.raw.conho ,R.raw.hinhhoc ,R.raw.hoahong },
		
		{ R.raw.butchi ,R.raw.caivi ,R.raw.quabi ,R.raw.traitim },
		
		{ R.raw.caikeo ,R.raw.caykem ,R.raw.conkenh ,R.raw.khucgo },
		
		{ R.raw.lacay ,R.raw.quale ,R.raw.qualuu ,R.raw.tholan },
		
		{ R.raw.caimu ,R.raw.conmeo_word ,R.raw.quaman ,R.raw.quame },
		
		{ R.raw.cainoi ,R.raw.connai ,R.raw.nuhoa ,R.raw.quana },
		
		{ R.raw.bongbong ,R.raw.conong ,R.raw.conso ,R.raw.cove },
		
		{ R.raw.balo ,R.raw.cogiao ,R.raw.honuoc ,R.raw.tochim },
		
		{ R.raw.caino ,R.raw.laco ,R.raw.quabo ,R.raw.quamo },
		
		{ R.raw.compa ,R.raw.hopphan ,R.raw.phaohoa ,R.raw.xaphong },
		
		{ R.raw.caiquan ,R.raw.monqua ,R.raw.quadat ,R.raw.quaquyt },
		
		{ R.raw.conran ,R.raw.conrong ,R.raw.conrua ,R.raw.urom },
		
		{ R.raw.casau ,R.raw.consau ,R.raw.consoc ,R.raw.quyensach },
		
		{ R.raw.caito ,R.raw.quatao ,R.raw.tauhoa_word ,R.raw.xetang },

		{ R.raw.caitu ,R.raw.concu ,R.raw.dudu ,R.raw.tulanh },
		
		{ R.raw.hopsua ,R.raw.lathu ,R.raw.quadua_word ,R.raw.sutu_word },
		
		{ R.raw.conve ,R.raw.convet ,R.raw.convoi_word ,R.raw.quyenvo },
		
		{ R.raw.caixeng ,R.raw.caixo ,R.raw.dongxu ,R.raw.xehoi_word },
		
		{ R.raw.caily ,R.raw.caiyem ,R.raw.mythuat ,R.raw.yta }
	};
	
	public static int audioWordEng[][] = new int[][] {
		{ R.raw.cup ,R.raw.fish ,R.raw.compass ,R.raw.house },
		
		{ R.raw.jumpball_quabong ,R.raw.cow_conbo ,R.raw.butterfly_conbuom ,R.raw.marble_honbi },
		
		{ R.raw.grasshopper_concaocao ,R.raw.fox_concao ,R.raw.stork_conco ,R.raw.crab_concua },
		
		{ R.raw.umbrella_caydu ,R.raw.goat_conde ,R.raw.sandal_doiep ,R.raw.piano },

		{ R.raw.wheel_banhxe ,R.raw.sparrow_chimse ,R.raw.shower_hoasen ,R.raw.bicycle_xedap },

		{ R.raw.chair_caighe ,R.raw.chicken ,R.raw.station_nhaga ,R.raw.brick_viengach },
		
		{ R.raw.clown_chuhe ,R.raw.tiger_conho ,R.raw.geometry_hinhoc ,R.raw.rose_hoahong },
		
		{ R.raw.pencil_butchi ,R.raw.purse_caivi ,R.raw.zucchini_quabi ,R.raw.heart_traitim },

		{ R.raw.scissor_caikeo ,R.raw.ice_cream_caykem ,R.raw.canal_conkenh ,R.raw.chump_khucgo },

		{ R.raw.foliage_lacay ,R.raw.pear_quale ,R.raw.pomegranate_qualuu ,R.raw.diver_tholan },

		{ R.raw.hat_caimu ,R.raw.cat_conmeo ,R.raw.plum_quaman ,R.raw.tamarind_quame },

		{ R.raw.saucepan_cainoi ,R.raw.deer_connai ,R.raw.button_nuhoa ,R.raw.fruit_traicay },

		{ R.raw.balloon_bongbay ,R.raw.bee_conong ,R.raw.numbers_conso ,R.raw.colour_mauve },

		{ R.raw.compass_p ,R.raw.chalk_hopphan ,R.raw.firework_phaohoa ,R.raw.soap_xaphong },

		{ R.raw.trousers_caiquan ,R.raw.gift_monqua ,R.raw.earth_traidat ,R.raw.tangerine_quaquyt },

		{ R.raw.snake_conran ,R.raw.dragon_conrong ,R.raw.turtle_conrua ,R.raw.straw_urom },

		{ R.raw.crocodile_casau ,R.raw.bug_consau ,R.raw.squirrel_consoc ,R.raw.book },

		{ R.raw.bowl_caito ,R.raw.apple_quatao ,R.raw.train_tauhoa ,R.raw.tank_xetang },

		{ R.raw.cupboard_caitu ,R.raw.owl_concu ,R.raw.papaya_dudu ,R.raw.fridge_tulanh },

		{ R.raw.mite_conve ,R.raw.popinjay_convet ,R.raw.elephant_convoi ,R.raw.notebook },

		{ R.raw.shovel_caixeng ,R.raw.bucket_caixo ,R.raw.coin ,R.raw.car },

		{ R.raw.glass_caily ,R.raw.brassiere_caiyem ,R.raw.art_mythuat ,R.raw.nurse_yta },
	};
	
	public static int audioAnimal[] = new int[] {
		R.raw.chimcanhcut,
		R.raw.ca,
		R.raw.chim,
		R.raw.cho,
		R.raw.chuot,
		R.raw.ech,
		R.raw.ga,
		R.raw.gautruc,
		R.raw.huou,
		R.raw.lacda,
		R.raw.lon,
		R.raw.meo,
		R.raw.ngua,
		R.raw.sutu,
		R.raw.tho,
		R.raw.trau,
		R.raw.vit,
		R.raw.voi
	};
	
	public static int audioAnimalEng[] = new int[] {
		R.raw.penguin,
		R.raw.fish,
		R.raw.sparrow,
		R.raw.dog,
		R.raw.mouse,
		R.raw.frog,
		R.raw.chicken,
		R.raw.panda,
		R.raw.deer,
		R.raw.camel,
		R.raw.pig,
		R.raw.cat,
		R.raw.horse,
		R.raw.lion,
		R.raw.rabbit,
		R.raw.buffalo,
		R.raw.duck,
		R.raw.elephant
	};
	
	public static int audioCar[] = new int[] {
		R.raw.xecau,
		R.raw.xecanhsat,
		R.raw.xecuuhoa,
		R.raw.duthuyen,
		R.raw.maybay,
		R.raw.maybaychiendau,
		R.raw.xexuc,
		R.raw.taudien,
		R.raw.xelua,
		R.raw.xetacxi,
		R.raw.tructhang,
		R.raw.xebus,
		R.raw.xecuuthuong,
		R.raw.xedap,
		R.raw.xedua,
		R.raw.xemay,
		R.raw.xehoi,
		R.raw.xexichlo
	};
	
	public static int audioCarEng[] = new int[] {
		R.raw.forklifttrucks,
		R.raw.policecar,
		R.raw.firetruck,
		R.raw.ship,
		R.raw.aircraft,
		R.raw.fighter,
		R.raw.crane,
		R.raw.locomotive,
		R.raw.train,
		R.raw.taxi,
		R.raw.helicopter,
		R.raw.bus,
		R.raw.ambulance,
		R.raw.bike,
		R.raw.racingcar,
		R.raw.motobike,
		R.raw.car,
		R.raw.pedicab
	};
	
	public static int audioNumber[] = new int[] {
		R.raw.a0,
		R.raw.a1,
		R.raw.a2,
		R.raw.a3,
		R.raw.a4,
		R.raw.a5,
		R.raw.a6,
		R.raw.a7,
		R.raw.a8,
		R.raw.a9,
		R.raw.a10,
		R.raw.a11,
		R.raw.a12,
		R.raw.daucong,
		R.raw.dautru,
		R.raw.daunhan,
		R.raw.dauchia,
		R.raw.phantram
	};
	
	public static int audioNumberEng[] = new int[] {
		R.raw.e0,
		R.raw.e1,
		R.raw.e2,
		R.raw.e3,
		R.raw.e4,
		R.raw.e5,
		R.raw.e6,
		R.raw.e7,
		R.raw.e8,
		R.raw.e9,
		R.raw.e10,
		R.raw.e11,
		R.raw.e12,
		R.raw.econg,
		R.raw.edautru,
		R.raw.enhan,
		R.raw.echia,
		R.raw.ephantram
	};
	
	public static int audioShape[] = new int[] {
		R.raw.dgthang,
		R.raw.dgcong,
		R.raw.chunhat,
		R.raw.elip,
		R.raw.cau,
		R.raw.chop,
		R.raw.luoiliem,
		R.raw.non,
		R.raw.tron,
		R.raw.vuong,
		R.raw.lapphuong,
		R.raw.lucgiac,
		R.raw.ngoisao,
		R.raw.ngugiac,
		R.raw.tamgiac,
		R.raw.trudac,
		R.raw.vanhkhuyen,
		R.raw.trurong
	};
	
	public static int audioShapeEng[] = new int[] {
		R.raw.line,
		R.raw.curve,
		R.raw.ractangular,
		R.raw.ellipse,
		R.raw.spherical,
		R.raw.pyramidal,
		R.raw.crescent,
		R.raw.cone,
		R.raw.circle,
		R.raw.spuare,
		R.raw.cube,
		R.raw.hexagonal,
		R.raw.starshaped,
		R.raw.pentagon,
		R.raw.triangle,
		R.raw.cylindrical,
		R.raw.annular,
		R.raw.hollowcylindrical
	};
	
	public static int audioFruit[] = new int[] {
		R.raw.ngo,
		R.raw.bido,
		R.raw.cachua,
		R.raw.cam,
		R.raw.carot,
		R.raw.catim,
		R.raw.naichuoi,
		R.raw.dao,
		R.raw.dautay,
		R.raw.quadua,
		R.raw.duachuot,
		R.raw.duahau,
		R.raw.le,
		R.raw.luu,
		R.raw.nho,
		R.raw.ot,
		R.raw.anhdao,
		R.raw.tao
	};
	
	public static int audioFruitEng[] = new int[] {
		R.raw.corn,
		R.raw.pumkin,
		R.raw.tomato,
		R.raw.orange,
		R.raw.carrot,
		R.raw.eggplant,
		R.raw.banana,
		R.raw.peach,
		R.raw.dautay,//chua co english
		R.raw.pineapple,
		R.raw.cucumber,
		R.raw.watermelon,
		R.raw.pear,
		R.raw.pomegranet,
		R.raw.grapes,
		R.raw.pepper,
		R.raw.cherries,
		R.raw.apple
	};
}
