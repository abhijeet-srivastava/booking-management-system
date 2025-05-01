package com.twisha.bookingmanagementsystem.repository;

import com.twisha.bookingmanagementsystem.model.WebSiteUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository <WebSiteUser, Long>{
}
