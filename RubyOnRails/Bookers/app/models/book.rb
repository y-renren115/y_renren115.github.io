class Book < ApplicationRecord
  
  belongs_to  :user # dependentはhas_manyのオプションで,この場合だとuserを消すことでuserが持っているbooksもまとめて消すことができる！

  validates :title, presence: true
  validates :body, presence: true, length: {maximum: 200}
end
