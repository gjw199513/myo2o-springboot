package com.imooc.myo2o.util;

import javax.servlet.http.HttpServletRequest;

/**
 * request.getParameter()方法尝试从http请求中获取对应字符串的数据(在post请求体中含有所需要的键值对),也可以是从url中获取到参数
 * 
 * @author hh
 *
 */
public class HttpServletRequestUtil {
	public static int getInt(HttpServletRequest request, String name) {
		try {
			return Integer.decode(request.getParameter(name));
		} catch (Exception e) {
			return -1;
		}
	}

	public static boolean getBoolean(HttpServletRequest request, String name) {
		try {
			return Boolean.valueOf(request.getParameter(name));
		} catch (Exception e) {
			return false;
		}
	}

	public static long getLong(HttpServletRequest request, String name) {

		try {
			return Long.valueOf(request.getParameter(name));
		} catch (Exception e) {
			return -1;
		}
	}

	public static Double getDouble(HttpServletRequest request, String name) {

		try {
			return Double.valueOf(request.getParameter(name));
		} catch (Exception e) {
			return -1d;
		}
	}

	public static String getString(HttpServletRequest request, String name) {
		try {
			String result = request.getParameter(name);
			if (result != null) {
				result = result.trim();
			}
			if ("".equals(result))
				result = null;
			return result;
		} catch (Exception e) {
			return null;
		}
	}
}
