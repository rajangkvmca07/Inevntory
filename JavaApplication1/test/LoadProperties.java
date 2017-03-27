/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajan.chaturvedi
 */
import java.io.FileInputStream;
import java.util.Properties;
public class LoadProperties {
    
    public static void main(String[] Str){
        FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("DbSetting.properties");
			Properties properties = new Properties();
			properties.load(fis);
                        System.out.println("---"+properties.getProperty("ServiceName"));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (fis != null)
					fis.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
    }
    
    public static Properties loadProperty(){
         FileInputStream fis = null;
         Properties properties = new Properties();
		try
		{
			fis = new FileInputStream("DbSetting.properties");
			properties.load(fis);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (fis != null)
					fis.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
                return properties;
    }
}
