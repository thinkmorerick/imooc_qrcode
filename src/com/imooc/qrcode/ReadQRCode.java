package com.imooc.qrcode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import jp.sourceforge.qrcode.QRCodeDecoder;

//使用QR Code方式解析二维码
public class ReadQRCode {

	public static void main(String[] args) throws IOException {
		BufferedImage bufferedImage = ImageIO.read(new File("qrcode.png"));
		
		QRCodeDecoder codeDecoder = new QRCodeDecoder();
		
		String result = new String(codeDecoder.decode(
				new MyQRCodeImage(bufferedImage)), "gb2312");
		
		System.out.println(result);
	}

}
