package design_patterns.structural.facade;

import java.io.File;

import design_patterns.structural.facade.some_complex_media_library.AudioMixer;
import design_patterns.structural.facade.some_complex_media_library.BitrateReader;
import design_patterns.structural.facade.some_complex_media_library.Codec;
import design_patterns.structural.facade.some_complex_media_library.CodecFactory;
import design_patterns.structural.facade.some_complex_media_library.MPEG4CompressionCodec;
import design_patterns.structural.facade.some_complex_media_library.OggCompressionCodec;
import design_patterns.structural.facade.some_complex_media_library.VideoFile;

public class VideoConversionFacade {
	public File convertVideo(String fileName, String format) {
		System.out.println("VideoConversionFacade: conversion started.");
		VideoFile file = new VideoFile(fileName);
		Codec sourceCodec = CodecFactory.extract(file);
		Codec destinationCodec;
		if (format.equals("mp4")) {
			destinationCodec = new MPEG4CompressionCodec();
		} else {
			destinationCodec = new OggCompressionCodec();
		}
		VideoFile buffer = BitrateReader.read(file, sourceCodec);
		VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
		File result = (new AudioMixer()).fix(intermediateResult);
		System.out.println("VideoConversionFacade: conversion completed.");
		return result;
	}
}