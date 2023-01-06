package com.raisetech.springbootstudy;

import java.net.URI;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class NameController {
  // GET
  @GetMapping("/names")
  public List<String> getNames() {
    return List.of("enami", "koyama", "noda", "akamatsu");
  }

  //  POST
  //  仮実装なのでResponseEntity.createdを戻り値に用いることでロケーションつき201応答を返している？？
  //  ロケーション情報が無いと登録ユーザーが何番になったかわからない。
  //  formからnameが取れるようにした
  //  ------------------------------------------------------------------------------
  //  ResponseEntity: HTTPレスポンスの情報を表すクラス
  //  @RequestBody: リクエストボディをJavaオブジェクトに変換する
  //  UriComponentsBuilder.fronUriString: URIを生成する
  //  ResponseEntity.created(url).body(name): 201レスポンスを返す
  @PostMapping("/names")
  public ResponseEntity<Map<String,String>> create(@RequestBody CreateForm form) {
    String name = form.getName();
    Map<String,String> message = Map.of("name", "'" + name + "'" + " successfully created");
    URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
      .path("/names/1")
      .build()
      .toUri();
    return ResponseEntity.created(url).body(message); //Stringで定義していたのでJSONで返せなかった
  }

//  PATCH
//  これも仮実装。
//  formからnameが取れるようにした
  @PatchMapping("/names/{id}")
  public ResponseEntity<Map<String, String>> update(@PathVariable("id") int id, @RequestBody UpdateForm form) {
    String name = form.getName();
    String message = "'" + name + "'" + " successfully updated";
    return ResponseEntity.ok(Map.of("message", message));
  }

//DELETE
  @DeleteMapping("/names/{id}")
  public ResponseEntity<Map<String, String>> delete(@PathVariable("id") int id)  {
    return ResponseEntity.ok(Map.of("message", "name successfully deleted"));
  }

}
