package br.com.alura.horas.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.alura.horas.modelos.HoraLancada;
import br.com.alura.horas.modelos.Usuario;

public class HoraLancadaDao {
	private EntityManager manager;

	@Inject
	public HoraLancadaDao(EntityManager manager){
		this.manager = manager;
		
	}
	
	public HoraLancadaDao(){}
	
	public void adiciona(HoraLancada horaLancada) {
		manager.getTransaction().begin();
		manager.persist(horaLancada);
		manager.getTransaction().commit();
	}

	public List<HoraLancada> lista() {
		String jpql = "select h from HoraLancada h ";
		TypedQuery<HoraLancada> query = manager.createQuery(jpql,HoraLancada.class);
		
		return query.getResultList();
	}

	public List<HoraLancada> horasDoUsuario(Usuario usuario) {
		String jpql = "select h from HoraLancada h where h.usuario = :usuario order by h.data";
		
		TypedQuery<HoraLancada> query = manager.createQuery(jpql,HoraLancada.class);
		query.setParameter("usuario",usuario);
		
		return query.getResultList();
	}

}
