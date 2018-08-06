package com.tec.info.dao;
import java.util.ArrayList;

import com.tec.info.dto.MajorDto;
import com.tec.info.dto.TecDto;
import com.tec.info.dto.TecMajorDto;

public interface IDao {
	
	public ArrayList<TecDto> teclistDao();
	public ArrayList<MajorDto> tec_viewDao();
	public ArrayList<TecMajorDto> tecselDao1(int major_id);
	public TecDto tecselDao2(int id);
}
