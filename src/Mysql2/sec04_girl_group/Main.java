package Mysql2.sec04_girl_group;

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		GirlGroupDao ggDao = new GirlGroupDao();

		GirlGroup gg = ggDao.getGirlGroupByGid(1005);
		System.out.println(gg);
		
		gg = ggDao.getGirlGroupByName("소녀");
		System.out.println(gg);
		System.out.println("==========================");
		
		
//		gg = new GirlGroup("뉴진스", LocalDate.parse("2022-07-22"), 117);
//		ggDao.insertGrilGroup(gg);
		
		gg = ggDao.getGirlGroupByGid(1007);
		gg.setName("에프엑스");
		ggDao.updateGirlGroup(gg);
		
//		ggDao.deleteGirlGroup(1019);
		
		List<GirlGroup> list = ggDao.getGirlGroupByDebut(2009, 2022);
		list.forEach(x -> System.out.println(x));
		
		ggDao.close();
	}

}
