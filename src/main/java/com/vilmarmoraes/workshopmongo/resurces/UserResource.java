package com.vilmarmoraes.workshopmongo.resurces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vilmarmoraes.workshopmongo.domain.User;
import com.vilmarmoraes.workshopmongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	// @RequestMapping(value="/{id}", method=RequestMethod.GET)
		@RequestMapping(method = RequestMethod.GET)
		public ResponseEntity<List<User>> findAll() {
			List<User> list = service.findAll();
			return ResponseEntity.ok().body(list);
		}
	
	/*
	 * @RequestMapping(method=RequestMethod.POST) public ResponseEntity<Void>
	 * insert(@RequestBody UserDTO objDto) { User obj = service.fromDTO(objDto); obj
	 * = service.insert(obj); URI uri =
	 * ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand
	 * (obj.getId()).toUri(); return ResponseEntity.created(uri).build(); }
	 * 
	 * @RequestMapping(value="/{id}", method=RequestMethod.DELETE) public
	 * ResponseEntity<Void> delete(@PathVariable String id) { service.delete(id);
	 * return ResponseEntity.noContent().build(); }
	 * 
	 * @RequestMapping(value="/{id}", method=RequestMethod.PUT) public
	 * ResponseEntity<Void> update(@RequestBody UserDTO objDto, @PathVariable String
	 * id) { User obj = service.fromDTO(objDto); obj.setId(id); obj =
	 * service.update(obj); return ResponseEntity.noContent().build(); }
	 * 
	 * @RequestMapping(value="/{id}/posts", method=RequestMethod.GET) public
	 * ResponseEntity<List<Post>> findPosts(@PathVariable String id) { User obj =
	 * service.findById(id); return ResponseEntity.ok().body(obj.getPosts()); }
	 */

}
