package practice.code.samples.fbfriends;

import java.awt.Desktop;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * You have facebook page view file being created on your machine. Use this file
 * as an input and open the profile of people who had viewed your profile
 * 
 * @author Pranav_Gothadiya
 *
 */
public class FindFBFriends {

	private static final String FILE_PATH = "C:/Home/fb_pg_views.txt";
	private static final String FB_URL = "https://www.facebook.com/";

	public static void main(String[] args) {

		List<String> urls = createUrlsFromIds(readIds(FILE_PATH));
		openUrlsInBrowser(urls);
	}

	private static void openUrlsInBrowser(List<String> urls) {
		for (String url : urls) {
			try {
				Desktop.getDesktop().browse(new URI(url));

			} catch (Exception e) {
			}

		}
	}

	/*
	 * Creates list of facebook urls from the ids
	 */
	private static List<String> createUrlsFromIds(long[] ids) {
		List<String> urls = new ArrayList<String>();
		for (long id : ids) {
			urls.add(FB_URL + id);
		}
		return urls;
	}

	/*
	 * Parses ids from the input from file and returns list of ids
	 */
	private static long[] readIds(String path) {

		Path aPath = Paths.get(path);
		try {
			String[] splits = new String(Files.readAllBytes(aPath)).split(",");
			long[] ids = new long[splits.length];
			int cnt = 0;

			for (String strId : splits) {
				strId = strId.substring(1, strId.length() - 3);
				ids[cnt++] = Long.parseLong(strId);
			}

			return ids;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
