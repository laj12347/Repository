package com.sishu.common.dao;

import java.util.List;

public interface BaseDao<M, QM> {

	public void create(M m);

	public void update(M m);

	public void delete(int uuid);

	public M getByUuid(int uuid);

	public List<M> getByConditionPage(QM qm);

}
