// Example
// use Test
db.createCollection('Z_AN_DEMO')

db.Z_AN_DEMO.insert({ name: 'A', year: 2000, gender: false, status: 'funny' } );
db.Z_AN_DEMO.insert({ name: 'B', year: 2000, gender: true, status: '' } );
db.Z_AN_DEMO.insert({ name: 'C', year: 1999, gender: false, status: 'funny' } );
db.Z_AN_DEMO.insertMany([
	{ name: 'D', year: 2000, gender: false, status: '' },
	{ name: 'E', year: 2001, gender: true, status: 'funny' },
	{ name: 'F', year: 2000, gender: false, status: '' } ] );

// Find
// Find All
db.Z_AN_DEMO.find().pretty();
// Find One top
db.Z_AN_DEMO.findOne();
// Find with where
db.Z_AN_DEMO.find({}).pretty(); // find all
db.Z_AN_DEMO.find({}, { name: 1, _id: 0 } ).pretty(); // find all and show only field name
db.Z_AN_DEMO.find({}, { name: 1 } ).pretty(); // find all and show field name, _id
db.Z_AN_DEMO.find({ name: 'A' } ).pretty(); // find where name = 'A'
/**
 * Operations
 * 
 * Equality: 				{<key>:{$eg;<value>}}
 * Less Than: 				{<key>:{$lt:<value>}}
 * Less Than Equals:		{<key>:{$lte:<value>}}
 * Greater Than:			{<key>:{$gt:<value>}}
 * Greater Than Equals:		{<key>:{$gte:<value>}}
 * Not Equals:				{<key>:{$ne:<value>}}
 * Values in an array:		{<key>:{$in:[<value1>, <value2>,……<valueN>]}}
 * Values not in an array:	{<key>:{$nin:<value>}}
 */
db.Z_AN_DEMO.find({ "name": 'A' } ).pretty()
db.Z_AN_DEMO.find({ "year": { $lt: 2000 } } ).pretty()
db.Z_AN_DEMO.find({ "year": { $lte: 2000 } } ).pretty()
db.Z_AN_DEMO.find({ "year": { $gt: 2000 } } ).pretty()
db.Z_AN_DEMO.find({ "year": { $gte: 2000 } } ).pretty()
db.Z_AN_DEMO.find({ "year": { $ne: 2000 } } ).pretty()
db.Z_AN_DEMO.find({ "name": { $in: ["A", "B", "C"] } } ).pretty()
db.Z_AN_DEMO.find({ "name": { $nin: ["C", "A"] } } ).pretty()


/**
 * AND, OR, NOR, NOT
 * 
 * AND:	db.COLLECTION_NAME.find({ $and: [ {key1:value1}, {key2:value2} ]}).pretty()
 * OR:	db.COLLECTION_NAME.find({ $or: [ {key1:value1}, {key2:value2} ]}).pretty()
 * NOR:	db.COLLECTION_NAME.find({ $nor: [ {key1: value1}, {key2:value2} ]}).pretty()
 * NOT:	db.COLLECTION_NAME.find({ field: { $not: { <operator-expression> }}}).pretty()
 * AND + OR : 
 */
db.Z_AN_DEMO.find({ name: 'A' }, { year: 2000 } ).pretty()
db.Z_AN_DEMO.find({ $or: [ { name: 'A' }, { year: 2000 } ] } ).pretty()
db.Z_AN_DEMO.find({ $nor: [ { name: 'A' }, { year:2000 } ] } ).pretty()
db.Z_AN_DEMO.find({ year: { $not: { $ne: 2000 } } } )
db.Z_AN_DEMO.find({ name: 'A' }, { $or: [{ year: 2000 }, { status: 'funny' }] }).pretty()

/**
 * Update, Save, Delete
 * 
 * Update: 			db.COLLECTION_NAME.update(SELECTION_CRITERIA, UPDATED_DATA)
 * UpdateOne:		db.COLLECTION_NAME.updateOne(<filter>, <update>)
 * UpdateMany:		db.COLLECTION_NAME.updateMany(<filter>, <update>)
 * 
 * FindOneAndUpdate: db.COLLECTION_NAME.findOneAndUpdate(SELECTIOIN_CRITERIA, UPDATED_DATA)
 * 
 * Save: 			db.COLLECTION_NAME.save({_id:ObjectId(),NEW_DATA})
 * 
 * Remove:			db.COLLECTION_NAME.remove(DELETION_CRITERIA) 
 * RemoveOne:		db.COLLECTION_NAME.remove(DELETION_CRITERIA,1)
 * RemoveAll:		db.COLLECTION_NAME.remove({})
 */
db.Z_AN_DEMO.update( { year: 2000 }, { $set: { year:201 } } )
db.Z_AN_DEMO.updateOne({ year: 2000 }, { $set: { year: 202 } })
db.Z_AN_DEMO.updateMany({ $or: [{ year: 201 }, { year: 202 }] }, { $set: { year: 2000 } })

db.Z_AN_DEMO.findOneAndUpdate({ name: 'B' }, { $set: { year: 2003 } } )

db.Z_AN_DEMO.save({ 
    "_id" : ObjectId("631eefe752d704b83027d8e6"), // from findOne(name:'A')
    "name" : "A", 
    "year" : 2000.0, 
    "gender" : false, 
    "status" : "funny"
})

db.Z_AN_DEMO.remove({name:'A'})
db.Z_AN_DEMO.remove({name:'A'}, 1)
db.Z_AN_DEMO.remove({})


/**
 * Limit, Skip, Sort
 * 
 * Limit:			db.COLLECTION_NAME.find().limit(NUMBER)
 * Skip:			db.COLLECTION_NAME.find().skip(NUMBER)
 * Limit & Skip:	db.COLLECTION_NAME.find().limit(NUMBER).skip(NUMBER)
 * 
 * Sort: 			db.COLLECTION_NAME.find().sort({KEY:type*})  *(type = 1: ASC, type = -1: DESC)
 */
db.Z_AN_DEMO.find({}).limit(2)
db.Z_AN_DEMO.find({}).skip(2)
db.Z_AN_DEMO.find({}).limit(2).skip(2)

db.Z_AN_DEMO.find({}).sort({name:1})
db.Z_AN_DEMO.find({}).sort({name:-1})

/**
 * Indexing
 * 
 * createIndex:			db.COLLECTION_NAME.createIndex({KEY:1})
 * getIndexes:			db.COLLECTION_NAME.getIndexes()
 * dropIndex:			db.COLLECTION_NAME.dropIndex({KEY:1})
 * dropIndexes:			db.COLLECTION_NAME.dropIndexes()
 * 
 */
db.Z_AN_DEMO.createIndex({ title: 1, description: -1 })
db.Z_AN_DEMO.getIndexes()
db.Z_AN_DEMO.dropIndex({ title: 1 })
db.Z_AN_DEMO.dropIndex({ title: 1, description: -1 })

/**
 * Aggregate
 * 
 * Aggregate:		db.COLLECTION_NAME.aggregate(AGGREGATE_OPERATION)
 * 
 * 
 * $sum			db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", num_tutorial : {$sum : "$year"}}}])
 * $avg			db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", num_tutorial : {$avg : "$year"}}}])
 * $min			db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", num_tutorial : {$min : "$year"}}}])
 * $max			db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", num_tutorial : {$max : "$year"}}}])
 * $push		db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", url : {$push: "$url"}}}])
 * $addToSet	db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", url : {$addToSet : "$url"}}}])
 * $first		db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", first_url : {$first : "$url"}}}])
 * $last		db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", last_url : {$last : "$url"}}}])
 * 
 */

db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", num_tutorial : {$sum : "$year"}}}])
db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", num_tutorial : {$avg : "$year"}}}])
db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", num_tutorial : {$min : "$year"}}}])
db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", num_tutorial : {$max : "$year"}}}])
db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", url : {$push: "$url"}}}])
db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", url : {$addToSet : "$url"}}}])
db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", first_url : {$first : "$url"}}}])
db.Z_AN_DEMO.aggregate([{$group : {_id : "$name", last_url : {$last : "$url"}}}])