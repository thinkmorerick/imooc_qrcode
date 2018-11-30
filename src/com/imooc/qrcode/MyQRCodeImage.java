package com.imooc.qrcode;

import java.awt.image.BufferedImage;

public class MyQRCodeImage implements jp.sourceforge.qrcode.data.QRCodeImage {
	
	BufferedImage bufferedImage;
	
	public MyQRCodeImage(BufferedImage bufferedImage) {
		this.bufferedImage = bufferedImage;
	}

	@Override
	public int getHeight() {
		return bufferedImage.getHeight();
	}

	@Override
	public int getPixel(int x, int y) {
		return bufferedImage.getRGB(x, y);
	}

	@Override
	public int getWidth() {
		return bufferedImage.getWidth();
	}

}
