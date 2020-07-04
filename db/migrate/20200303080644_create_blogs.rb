class CreateBlogs < ActiveRecord::Migration[5.0]
  def change
    create_table :blogs do |t|
      t.string         :name
      t.text           :text
      t.text           :image
      t.timestamps
    end
  end
end
