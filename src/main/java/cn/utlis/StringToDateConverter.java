package cn.utlis;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 页面时间字符串转换的工具类
 * @author ASUS
 *
 */
public class StringToDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String date) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
