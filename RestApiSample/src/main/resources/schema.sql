/* ユーザーテーブル作成 */
CREATE TABLE IF NOT EXISTS user ( 
  id CHAR(26) NOT NULL
  ,name VARCHAR(255)  NOT NULL
  ,birthdate DATE NOT NULL
  ,deleted BOOLEAN NOT NULL
  ,created_at DATETIME NOT NULL
  ,created_by VARCHAR(255) NOT NULL
  ,updated_at DATETIME NOT NULL
  ,updated_by VARCHAR(255) NOT NULL
  ,deleted_at DATETIME
  ,deleted_by VARCHAR(255)
  ,PRIMARY KEY (id) 
) DEFAULT CHARSET=utf8;