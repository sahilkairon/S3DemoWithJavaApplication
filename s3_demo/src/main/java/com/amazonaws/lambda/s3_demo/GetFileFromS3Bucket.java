package com.amazonaws.lambda.s3_demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.S3Object;

public class GetFileFromS3Bucket {
	
	public static void main(String[] args) {

//	key is just the file name
	String Key = "demo.txt";
	String BucketName = "fingerPrintBucket";

	final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();

	S3Object object = s3.getObject(BucketName, Key);

	InputStream objectData = object.getObjectContent();

	try
	{	FileWriter writerfile = new FileWriter("D:\\testout.txt");  
		BufferedReader reader = new BufferedReader(new InputStreamReader(objectData));
		BufferedWriter writer = new BufferedWriter(writerfile);
		
//		in case text is stored in the bucket file we can fetch that text
		String line; 
		
		while((line = reader.readLine()) != null) {
//			can store the file locally as well using the buffered writer
			System.out.println(line);
		}
		
	 
	}catch(Exception e)
	{

	}
	
}
}

