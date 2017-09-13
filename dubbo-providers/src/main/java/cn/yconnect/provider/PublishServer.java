package cn.yconnect.provider;

import java.io.IOException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 发布服务
 * @author admin
 *
 */
public class PublishServer {

//	@Override
//	public void contextInitialized(ServletContextEvent sce) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//				new String[] { "/applicationContext-dubbo.xml" });
//		System.out.println("启动");
//		context.start();
//		System.out.println("启动了");
//		/*try {
//			System.in.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}*/
//	}
//
//	@Override
//	public void contextDestroyed(ServletContextEvent sce) {
//
//	}

	public static void main(String[] args) throws InterruptedException{
		PublishServer publishServer =new PublishServer();
		publishServer.start();
		Thread.sleep(1000*60*10);
	}

	void start(){
		String configLocation="applicationContext-dubbo.xml";
		ApplicationContext context =new ClassPathXmlApplicationContext(configLocation);
		String[] names=context.getBeanDefinitionNames();
		System.out.print("Beans:");
		for(String string : names)
			System.out.print(string+",");
		System.out.println();
	}

}
