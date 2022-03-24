package com.example.springpetclinic.service.impl;

import com.example.springpetclinic.model.Owner;
import com.example.springpetclinic.repositories.OwnerRepository;
import com.example.springpetclinic.repositories.PetRepository;
import com.example.springpetclinic.repositories.PetTypeRepository;
import com.example.springpetclinic.service.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OwnerServiceImplTest {

    @Mock
    private OwnerRepository ownerRepository;
    @Mock
    private PetRepository petRepository;
    @Mock
    private PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerServiceImpl ownerService;
    final Long ownerId = 1L;

    final String lastName= "Smith";
    Owner returnOwner;

    @BeforeEach
    void setUp() {
        returnOwner = Owner.builder().id(1l).lastName(lastName).build();
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));

        Owner owner = ownerService.findById(1L);

        assertNotNull(owner);
    }
    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        Owner owner = ownerService.findById(1L);

        assertNull(owner);
    }
    @Test
    void save() {
        Owner ownerToSave = Owner.builder().id(1L).build();

        when(ownerRepository.save(any())).thenReturn(returnOwner);

        Owner savedOwner = ownerService.save(ownerToSave);

        assertNotNull(savedOwner);

        verify(ownerRepository).save(any());
    }

    @Test
    void findAll() {
        Set<Owner> returnOwnersSet = new HashSet<>();
        returnOwnersSet.add(Owner.builder().id(1l).build());
        returnOwnersSet.add(Owner.builder().id(2l).build());

        when(ownerRepository.findAll()).thenReturn(returnOwnersSet);

        Set<Owner> owners = ownerService.findAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    @Test
    void delete() {
        ownerService.delete(returnOwner);

        //default is 1 times
        verify(ownerRepository, times(1)).delete(any());
    }

    @Test
    void deleteById() {
        ownerService.deleteById(1L);

        verify(ownerRepository).deleteById(anyLong());

    }

    @Test
    void findByLastName() {
        Owner owner = Owner.builder().id(ownerId).lastName(lastName).build();
        when(ownerRepository.findByLastName("Smith")).thenReturn(owner);
        Owner owner1 = ownerService.findByLastName(lastName);
        assertEquals(lastName, owner1.getLastName());
        verify(ownerRepository).findByLastName(any());
    }
}