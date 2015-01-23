package ru.synq.smev;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class FindSpecification implements Specification<Data> {
    private final FindProperties properties;

    public FindSpecification(FindProperties properties) {
        this.properties = properties;
    }

    @Override
    public Predicate toPredicate(Root<Data> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        Set<Predicate> restrictions = new HashSet<>();

        if (properties.getInput1() != null) {
            restrictions.add(cb.like(cb.lower(root.<String>get("input1")), properties.getInput1() + "%"));
        }
        if (properties.getStatus() != null) {
            restrictions.add(cb.equal(cb.lower(root.<String>get("status")), properties.getStatus()));
        }

        return cb.and(restrictions.toArray((Predicate[]) Array.newInstance(Predicate.class, restrictions.size())));
    }
}
