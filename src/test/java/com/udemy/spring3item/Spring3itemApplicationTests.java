package com.udemy.spring3item;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.udemy.spring3item.controller.ItemController;
import com.udemy.spring3item.repo.ItemRepository;
import com.udemy.spring3item.service.ItemService;

@SpringBootTest
class Spring3itemApplicationTests {

	@Autowired
	private ItemController itemController;
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private ItemRepository itemRepository;
	
	//
	@Test
	void contextLoads() {
		assertThat(itemController).isNotNull();
		assertThat(itemService).isNotNull();
		assertThat(itemRepository).isNotNull();
	}

}
