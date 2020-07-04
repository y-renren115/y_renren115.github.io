class CreateNeotts < ActiveRecord::Migration[5.2]
  def change
    create_table :neotts do |t|
      t.text :text
      t.timestamps
    end
  end
end
