package Dao;

import Metier.*;

public class TestServiceDao {

	public static void main(String[] args){

		user u=new user();
		new_user nu = new new_user();
		u.setEmail("ismail@gmail.com");
		u.setMotPasse("aqwzsxedc");
		u.setNomPrenom("fakiri");
//		ServiceDAO.AddUser(u);
		
		news n=new news();
		n.setUrl("LSDJJ");
		n.setDateInsertion("16/12/2019");
		n.setTitre("lKDSJi");
		
		reaction r = new reaction();
		r.setNum(22);
		r.setDateReaction("11/03/2020");
		r.setReaction(true);
		
		user_reaction run = new user_reaction();
		run.setNews(n);
		run.setReaction(r);
		run.setUser(u);
		
		ServiceDAO.AddReaction(run);
		ServiceDAO.NbAimeNews(n);
		nu.setNews(n);
		nu.setUser(u);
		ServiceDAO.AddNews(nu);
//		for(new_user a:ServiceDAO.getAllNews()) {
//		System.out.println(a.toString());
//	}
		
//		reaction f=new reaction();
//		f.setNum(5);
//		f.setDateReaction(s);
//		f.setReaction(false);
//		f.setNews(n);
//		f.setUser(u);
//		
//		System.out.println(ServiceDAO.getAllNews().get(0).getUrl());
		
	}
}