DROP TABLE IF EXISTS todoitem;
CREATE TABLE todoitem (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  content VARCHAR(100) NOT NULL,
  status tinyint(1) NOT NULL
);
INSERT INTO todoitem (id, content, status) VALUES
 ('1','gdfgd','1'),
 ('2','8gdg2','1'),
 ('3','6df9','1'),
 ('4','4gdfg1','1'),
  ('5','gdfdg','0')