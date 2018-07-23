package com.jossemargt.cmsgalatea.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooReadOnlyRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Provides default query methods for Read Only entities, for 
 * example for mapped database views. It duplicates all methods 
 * from the JPARepository, but without the methods that perform any 
 * data modification (save*, delete*).
 *
 * @see JPARepository
 * @param <T>
 *            the domain type the repository manages
 * @param <ID>
 *          the type of the id of the entity the repository manages
 */
@NoRepositoryBean
@Transactional(readOnly = true)
@RooReadOnlyRepository
public interface ReadOnlyRepository<T, ID extends Serializable> extends Repository<T, ID> {

    /**
     * Retrieves an entity by its id.
     *
     * @param id
     *            must not be {@literal null}.
     * @return the entity with the given id or {@literal null} 
     * if none found
     * @throws IllegalArgumentException
     *             if {@code id} is {@literal null}
     */
    T findOne(ID id);

    /**
     * Returns whether an entity with the given id exists.
     *
     * @param id
     *            must not be {@literal null}.
     * @return true if an entity with the given id exists, 
     * {@literal false} otherwise
     * @throws IllegalArgumentException
     *             if {@code id} is {@literal null}
     */
    boolean exists(ID id);

    /**
     * Returns all instances of the type.
     *
     * @return all entities
     */
    List<T> findAll();

    /**
     * Returns all instances of the type with the given IDs.
     *
     * @param ids
     * @return
     */
    List<T> findAll(Iterable<ID> ids);

    /**
     * Returns the number of entities available.
     *
     * @return the number of entities
     */
    long count();

    /**
     * Returns all entities sorted by the given options.
     *
     * @param sort
     * @return all entities sorted by the given options
     */
    List<T> findAll(Sort sort);

    /**
     * Returns a {@link Page} of entities meeting the 
     * paging restriction provided in the {@code Pageable} object.
     *
     * @param pageable
     * @return a page of entities
     */
    Page<T> findAll(Pageable pageable);

    /**
     * Returns a reference to the entity with the given identifier.
     *
     * @param id
     *            must not be {@literal null}.
     * @return a reference to the entity with the given identifier.
     * @see EntityManager#getReference(Class, Object)
     */
    T getOne(ID id);
}