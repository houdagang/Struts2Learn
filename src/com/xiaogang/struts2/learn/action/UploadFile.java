package com.xiaogang.struts2.learn.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @ProjectName : Struts2Learn
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2019/12/31 23:21
 */
public class UploadFile extends ActionSupport {

    private File myFile;
    private String myFileContentType;
    private String myFileFileName;

    private String destPath;

    public String execute() {
        /* Copy file to a safe location */
        destPath = "D:/work/";
        try{
            System.out.println("Src File name: " + myFile);
            System.out.println("Dst File name: " + myFileFileName);

            File destFile  = new File(destPath, myFileFileName);
            FileUtils.copyFile(myFile, destFile);

        }catch(Exception e){
            e.printStackTrace();
            return ERROR;
        }
        return SUCCESS;
    }
    public File getMyFile() {
        return myFile;
    }
    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }
    public String getMyFileContentType() {
        return myFileContentType;
    }
    public void setMyFileContentType(String myFileContentType) {
        this.myFileContentType = myFileContentType;
    }
    public String getMyFileFileName() {
        return myFileFileName;
    }
    public void setMyFileFileName(String myFileFileName) {
        this.myFileFileName = myFileFileName;
    }
}
