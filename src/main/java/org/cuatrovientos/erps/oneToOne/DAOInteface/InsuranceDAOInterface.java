package org.cuatrovientos.erps.oneToOne.DAOInteface;

import java.util.List;

import org.cuatrovientos.erps.oneToOne.models.Insurance;


public interface InsuranceDAOInterface {
	public Insurance selectById(Long id);
	public List<Insurance> selectAll ();
	public void insert (Insurance insurance);
	public void update (Insurance insurance);
	public void delete (Insurance insurance);
}
