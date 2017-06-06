/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iqraapi;

/**
 *
 * @author Iqra
 */
public class getNowDate(){
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Calendar calendar = format.getCalendar();
	calendar.setTimeInMillis(System.currentTimeMillis());
	return calendar.getTime();
}
