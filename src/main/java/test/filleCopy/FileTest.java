package test.filleCopy;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

public class FileTest {
	
	
	
	public static void main(String[] args){

		//记录开始时间
		long q = System.currentTimeMillis();
		
		//copy
//		new FileTest().copyFiles("E:/1111/", "E:/test/1111/");
		new FileTest().mkPdf("D:/test/", "D:/test/1111/", 60000);
		
		//输出复制时长（毫秒）
    	System.out.println(System.currentTimeMillis()-q);
	}


	/**
	 * 复制文件夹，包括文件夹内文件夹 (FileChanel方法)
	 * @description 
	 * @param fromFile 源文件路径（文件、目录）
	 * @param toFile   目标文件（文件、目录）
	 * @author chenpengwei
	 * @date 2019-5-10 下午12:51:59
	 */
	public void copyFiles(String fromFile, String toFile){
		
		//文件数组
		File[] listFiles = null;
		
		//获取文件
		File file = new File(fromFile);
        
        //fromFile为目录
        if(file.isDirectory()){
        	
        	//源文件列表数组
        	listFiles = file.listFiles();
        	
        	//遍历目录下所有文件
        	for(File f : listFiles){
        		
        		//是文件夹
        		if(f.isDirectory()){
        			
        			//递归调用
        			copyFiles(fromFile + f.getName()+"/", toFile + f.getName()+"/");
        			
        			//是文件
        		}else if(f.isFile()){
        			
        			//目标目录
        			File toFileSrc = new File(toFile);
        			//如果路径不存在则创建
        			if(!toFileSrc.exists()) toFileSrc.mkdirs();
        			//复制
        			fileChannel(fromFile + f.getName(), toFile+f.getName());
        		}
        	}
        	
        //fromFile为单个文件
        }else if(file.isFile()){
        	//复制
        	fileChannel(fromFile, toFile + file.getName());
        }
		
	}
	
	
	/**
	 * 文件复制（FileChannel）
	 * @description 
	 * @param fromFile
	 * @param toFile
	 * @author chenpengwei
	 * @date 2019-5-10 下午12:58:33
	 */
	public void fileChannel(String fromFile, String toFile) {
		
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        FileChannel fileChannelInput = null;
        FileChannel fileChannelOutput = null;
        
        try {
            fileInputStream = new FileInputStream(fromFile);
            fileOutputStream = new FileOutputStream(toFile);
            //得到fileInputStream的文件通道
            fileChannelInput = fileInputStream.getChannel();
            //得到fileOutputStream的文件通道
            fileChannelOutput = fileOutputStream.getChannel();
            //将fileChannelInput通道的数据，写入到fileChannelOutput通道
            fileChannelInput.transferTo(0, fileChannelInput.size(), fileChannelOutput);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null)   fileInputStream.close();
                if (fileChannelInput != null)  fileChannelInput.close();
                if (fileOutputStream != null)  fileOutputStream.close();
                if (fileChannelOutput != null) fileChannelOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }

	
	/**
	 * 文件复制（缓冲流）
	 * @description 
	 * @param fromFile
	 * @param toFile
	 * @throws FileNotFoundException
	 * @author chenpengwei
	 * @date 2019-5-10 下午12:58:02
	 */
	public void file(String fromFile, String toFile){
		
		//声明流对象
        InputStream inputStream = null;
        OutputStream outputStream = null;
        
        try {
            inputStream = new BufferedInputStream(new FileInputStream(fromFile));
            outputStream = new BufferedOutputStream(new FileOutputStream(toFile));
            byte[] bytes = new byte[1024];
            int i;
            //读取到输入流数据，然后写入到输出流中去，实现复制
            while ((i = inputStream.read(bytes)) != -1)  outputStream.write(bytes, 0, i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null)  inputStream.close();
                if (outputStream != null) outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }
	
	
	/**
	 * 创建Z个文件
	 * @description 
	 * @param fromFile
	 * @param toFile
	 * @author chenpengwei
	 * @date 2019-5-10 下午12:50:37
	 */
	private void mkPdf(String fromFile, String toFile, int z) {

		File fromFileSrc = new File(fromFile);
		File[] listFiles = fromFileSrc.listFiles();
		
		//如果路径不存在则创建
		if(!new File(toFile).exists()) new File(toFile).mkdirs();
		
		for(int y=0;y<z;y++){
			for(int i=0;i<listFiles.length;i++){
				String s = listFiles[i].getName().substring(0, listFiles[i].getName().length()-4);
				String e = listFiles[i].getName().substring(listFiles[i].getName().length()-4);
				fileChannel(fromFile+listFiles[i].getName(), toFile+Integer.parseInt(s)+y+e);
			}
		}
		
	}
	
}
