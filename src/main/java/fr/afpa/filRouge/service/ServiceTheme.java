/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import fr.afpa.filRouge.model.Theme;
import fr.afpa.filRouge.repository.ThemeRepository;

/**
 * @author PH GUIGUE
 *
 */
public class ServiceTheme implements IserviceTheme {

	private ThemeRepository themeRepository;

	public ServiceTheme(ThemeRepository themeRepository) {
		this.themeRepository = themeRepository;
	}

	@Override
	public List<Theme> getAll() {
		List<Theme> themes = themeRepository.findAll();
		return themes;
	}

	@Override
	public Theme getOne(String nameTheme) {
		Theme theme = themeRepository.findOneByNameTheme(nameTheme);
		return theme;
	}

	@Override
	public void addTheme(Theme theme) {
		themeRepository.save(theme);
	}

	@Override
	public void delTheme(Theme theme) {
		themeRepository.delete(theme);
	}

	@Override
	public void modifiedOne(Theme theme) {
		themeRepository.save(theme);
	}

}
