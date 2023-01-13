package cl.generation.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.generation.web.models.Auto;
import cl.generation.web.repositories.AutoRepository;


@Service
public class AutoServiceImpl implements AutoService{
	@Autowired 
	private AutoRepository autoRepository;

	@Override
	public Auto guardarAuto(Auto auto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Auto> listarAutos() {
		return autoRepository.findAll();
	}

	public Auto obtenerAuto(Long id) {
		return autoRepository.findById(id).get();
	}

	
	
}