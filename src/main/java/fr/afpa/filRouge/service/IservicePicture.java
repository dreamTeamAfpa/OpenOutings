package fr.afpa.filRouge.service;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/*
 * @author RTI
 */
@Service
public interface IservicePicture {

	public void store(MultipartFile file);
	
	public Resource loadFile(String filename);
	
	public void deleteAll();
	
	public void init();
}
