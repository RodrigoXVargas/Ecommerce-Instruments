package com.e_music.project_emusic.services;

import com.e_music.project_emusic.entities.Brand;
import com.e_music.project_emusic.entities.Cart;
import com.e_music.project_emusic.entities.Category;
import com.e_music.project_emusic.repositories.RepositoryBase;
import com.e_music.project_emusic.repositories.RepositoryCategory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ServiceCategoryImpl extends ServiceBaseImpl<Category, Long> implements ServiceCategory{

    public ServiceCategoryImpl(RepositoryBase<Category, Long> repositoryBase){ super(repositoryBase); }

    @Autowired
    private RepositoryCategory repositoryCategory;

    @Override
    public List<Category> findAllByActive() throws Exception{
        try{
            List<Category> opt = repositoryCategory.findAllByActive();
            return opt;
        }catch (Exception e){
            log.info(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }


}